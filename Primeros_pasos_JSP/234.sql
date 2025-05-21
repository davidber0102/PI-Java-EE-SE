CREATE DATABASE proyecto_jsp;

USE proyecto_jsp;

CREATE TABLE IF NOT EXISTS usuarios(
	Id int(11) AUTO_INCREMENT NOT NULL,
    Nombre VARCHAR(20) NOT NULL,
    Apellido VARCHAR(20) NOT NULL,
    NUsuario VARCHAR(20) NOT NULL,
    Contrasena VARCHAR(20) NOT NULL,
    Pais VARCHAR(20) NOT NULL,
    Tecnologia VARCHAR(20),
     PRIMARY KEY(Id)    
);
USE proyecto_jsp;
SELECT * FROM usuarios;

-- VIDEO 234 MINUTO 18
INSERT INTO `proyecto_jsp`.`usuarios`
(`Id`,
`Nombre`,
`Apellido`,
`NUsuario`,
`Contrasena`,
`Pais`,
`Tecnologia`)
VALUES
(<{Id: }>,
<{Nombre: }>,
<{Apellido: }>,
<{NUsuario: }>,
<{Contrasena: }>,
<{Pais: }>,
<{Tecnologia: }>);


SELECT distinctrow  FROM usuarios WHERE 'Usuario' 'd.bernal' AND 'Contrasena' = '1234';