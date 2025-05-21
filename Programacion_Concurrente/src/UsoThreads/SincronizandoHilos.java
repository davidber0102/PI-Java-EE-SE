package UsoThreads;

public class SincronizandoHilos {
	public static void main(String[] args) {
		HilosVarios h1 = new HilosVarios();
		HilosVarios2 h2 = new HilosVarios2(h1);
		
		h2.start();
		
		h1.start();		
		
		System.out.println("Terminadas las tareas");

	}
}

class HilosVarios extends Thread{
	public void run() {
		
		for (int i=0; i<15;i++) {
			System.out.println("Ejecuntando hilo" + getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class HilosVarios2 extends Thread{
	public HilosVarios2(Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run() {
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<15;i++) {
			System.out.println("Ejecuntando hilo" + getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	private Thread hilo;
}