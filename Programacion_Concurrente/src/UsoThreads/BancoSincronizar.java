package UsoThreads;
import java.util.concurrent.locks.*;

public class BancoSincronizar {
	public static void main(String[] args) {
		Banco n = new Banco();
		for(int i=0; i<100; i++) {
			EjecucionTransferencias r = new EjecucionTransferencias(n, i, 2000);
			Thread t = new Thread(r);
			t.start();
		}

	}
}

class Banco{
	public Banco(){
		cuentas =  new double [100];		
		for (int i=0; i<cuentas.length;i++) {
			cuentas[i] = 2000;
		}
		//saldoSuficiente = ciereBanco.newCondition();
	}
	
	public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		//ciereBanco.lock();
		
		//try {	
			while (cuentas[cuentaOrigen]< cantidad) { // evalua que el saldo no es inferior a la transferencia
				wait();
				//saldoSuficiente.await();
				//System.out.println("------ CANTIDAD INSUFICIENTE: " + cuentaOrigen + "..... SALDO: " + cuentas[cuentaOrigen] + "..." + cantidad );
				//return;
			//}else {
				//System.out.println("------ ------------ CANTIDAD OK----------- "  + cuentaOrigen );
			}
			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen]-=cantidad; // dinero que sale de la cuenta origen
			System.out.printf("%10.2f sw %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			cuentas[cuentaDestino] += cantidad;		
			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());	
			//saldoSuficiente.signalAll();
			notifyAll();
		}//finally {
			//ciereBanco.unlock();
	     //}
	//}
	
	public double getSaldoTotal() {
		double sumeCuentas = 0;		
		for (double a: cuentas) {
			sumeCuentas+=a;
		}
		return sumeCuentas;
	}
	private final double [] cuentas;
	//private final Lock ciereBanco =new ReentrantLock();
	//private Condition saldoSuficiente;
}

class EjecucionTransferencias implements Runnable{
	public EjecucionTransferencias(Banco b, int de, double max) {
		banco=b;
		deLaCuenta= de;
		cantidadMax = max;
	}

	@Override
	public void run() {
		try {
			while(true) {
				int paraLaCuenta = (int) (100 * Math.random());
				double cantidad = cantidadMax * Math.random();
				banco.transferencias(deLaCuenta, paraLaCuenta, cantidad);
				Thread.sleep((int)(Math.random()*10));
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
}