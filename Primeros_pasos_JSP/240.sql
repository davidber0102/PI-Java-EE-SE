/*
		video 243
			jsp tags III
*/
CREATE TABLE IF NOT EXISTS empleados(
	Id int(11) AUTO_INCREMENT NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NOT NULL,
    Puesto VARCHAR(50) NOT NULL,
    Salario int,
    Primary key(Id));
    

INSERT INTO `proyecto_jsp`.`empleados`(`Nombre`,`Apellido`,`Puesto`,`Salario`)
			VALUES("Ana", "Lopez", "Directora", 75000), ("Antonio", "Fernadez", "Administrativo", 35000), ("Sandra", "Fernandez", "Jefa Area", 45000) ;

SELECT * FROM empleados;

/*
	-------------------¿que son los serlvets?------------------------------
    programas java que se ejecutan e un servidor web
    El servlet recibe peticiones del cliente(navegador) y realiza su tarea ¿Que tarea?
		* genera una respuesta HTML
		* LLAMAR A OTROS SERVLETS
        * UTILIZAR COOKIES Y SESIONES
        * ENLACE(CONTROLADOR) ENTRE EL CLIENTE Y BBDD
	
    DIFERENCIA ENTRE SERVLET Y JSP
		PAGINA JSP ES CODIGO HTML MEZCLADO CON CODIGO JAVA
        UNA PAGINA SERVLET SOLO ES CODIGO JAVA QUE HACE PETICION UN HTML
	
    ESQUEMA DE FUNCIONAMIENTO
		NAVEADOR CLIENTE
			PETICION (REQUEST HTTP)
				SI ES NECESARIO GENERA UN DOCUMENTO HTML
			RESPUESTA(RQSPONSE)
		SERVIDOR(SERVLET - CLASE JAVA)
        
        JSP: LOGICA DE PROGRAMACION POCA, ES DECIR QUE QUE EL CODIGO JAVA QUE SEA CONTRUYA POCAS LINEAS DE CODIGO
        SERVLET: LOGICA DE PROGRAMACION MAS EXTENSA, QUIERE DECIR LAS LINEAS DE CODIGO JAVA SEA MAS EXTENSA POR NECESIDADES DEL DESAROLLO COMPLEJO 
        
        PUEDEN TRABAJAR JSP Y SERVLET DE FORMA CONJUNTA PARA RESOLVER PORBLEMAS COMPLEJOS, QUE QUIERE DECIR MUVCHOAS LINEAS DE DOFIHO
        
        
        PASOS PARA CREAR SERVLETS
			1.- CREACION DE CLASE QUE HEREDE DE HttpSerlet
				* HttpServlet tiene entre otros metodos doGet (request, response)
					Este metodo es el encargado de recibir la peticion(request)
			2.- Establecer el formato de la respuesta (html)
            3.- Generar el contenido de la respues(html)
            
            clases, interfaces, metodos metodos necesarios
				clase HttpServlet
					Metodo doGeto(HttpServletRequest, HttpServletResponse)
				Intercace Servlet
                
                Interface ServletResponse
					Metodo getWritte()
                    Clase PrintWritter()
				Interface ServletResponse
                
                
		get vs post
        
        
        get: envia la informacion utilizando la url del navegador como vehiculode transporte
			ejemplo: www.pildorasinformaticas.es?campo1=valor¬campo2=valor2
				recomendable para depuraciones
                limitaciones en cuanto a cantidad de datos a enviar
                se puede guardar en favoritos o enviar la direccion a alguien
	
		post:  envia la informacion utilizando el objeto request como cehiculo de transporte
			Formulario ----------------datos Formulario(Request)--------------> Servlet
				util para enviar gran cantidad de informacion
                Capacodad de enviar datos adjuntos, datos binarios
*/
use proyecto_jsp;
SELECT * FROM productos;

ALTER TABLE `proyecto_jsp`.`productos` CHANGE COLUMN `FECHA` `FECHA` DATE;


Columns  CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN, FOTO