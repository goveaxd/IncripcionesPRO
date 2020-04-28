create database inscripciones;
use inscripciones;


CREATE TABLE carreras (
  idcarrera smallint(6) NOT NULL auto_increment,
  codigo varchar(15) NOT NULL,
  nombre varchar(60) NOT NULL,
  creditosTotales int(11) NOT NULL,
  PRIMARY KEY (idcarrera)
);
insert into carreras values ('1', 'hfjks', 'tics', 9);
insert into carreras values ('2', 'lslldl', 'gestion', 8);
insert into carreras values ('3', '34fff', 'admin', 7);
insert into carreras values ('4', 'dsdsfs', 'mecatronica', 10);
insert into carreras values ('5', 'lijdsflj', 'bioquimica', 5);

CREATE TABLE alumnos (
  idAlumno int(11) NOT NULL AUTO_INCREMENT,
   idcarrera smallint(6) NOT NULL,
  Nombre varchar(45) NOT NULL,
  Apellidos varchar(45) NOT NULL,
  NoControl varchar(45) NOT NULL,
  Correo varchar(45) NOT NULL,
  Contraseña varchar(45) NOT NULL,
  PRIMARY KEY (idAlumno),
  FOREIGN KEY(idcarrera) REFERENCES carreras (idcarrera)
);
insert into alumnos values ('1', '1', 'daniel', 'belmonte diaz', '16640099', 'daniel@gmail.com', '1234');
insert into alumnos values ('2', '2', 'cecilia', 'alanis cazares', '16640098', 'ceci@gmail.com', '1234');
insert into alumnos values ('3', '1', 'miguel', 'hernandez reyes', '16640100', 'mike@gmail.com', '1234');
insert into alumnos values ('4', '3', 'luis', 'govea magaña', '16640095', 'luis@gmail.com', '1234');
insert into alumnos values ('5', '4', 'chuy', 'gonzales ruiz', '16640091', 'chuy@gmail.com', '1234');

CREATE TABLE `docentes` (
  `iddocente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `RFC` varchar(12) NOT NULL,
  `mail` varchar(45) NOT NULL,
  PRIMARY KEY (`iddocente`)
) ;
INSERT INTO `inscripciones`.`docentes` (`nombre`, `apellido`, `RFC`, `mail`) VALUES ('Heris', 'Flores', 'BY123J1', 'elheris@gmail.com');
INSERT INTO `inscripciones`.`docentes` (`nombre`, `apellido`, `RFC`, `mail`) VALUES ('Teresa', 'Pichardo', 'JD7DS01', 'tere@gmail.com');
INSERT INTO `inscripciones`.`docentes` (`nombre`, `apellido`, `RFC`, `mail`) VALUES ('Estela', 'Romero', 'F8D7D6F', 'estela@gmail.com');
INSERT INTO `inscripciones`.`docentes` (`nombre`, `apellido`, `RFC`, `mail`) VALUES ('Jose', 'Perez', 'AD5D4F3', 'juan@gmail.com');
INSERT INTO `inscripciones`.`docentes` (`nombre`, `apellido`, `RFC`, `mail`) VALUES ('Nicolas', 'Jasso', 'AS7D65F', 'nico@gmail.com');

CREATE TABLE `materias` (
  `idmaterias` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_materia` varchar(60) NOT NULL,
  `codigo_materia` varchar(45) NOT NULL,
  `creditos` int(11) NOT NULL,
  `idcarrera` smallint(6) NOT NULL,
  PRIMARY KEY (`idmaterias`),
  FOREIGN KEY(idcarrera) REFERENCES carreras (idcarrera)
);
INSERT INTO `inscripciones`.`materias` (`nombre_materia`, `codigo_materia`, `creditos`, `idcarrera`) VALUES ('Gestion de Proyectos de Software', 'GPS63618', '5', '1');
INSERT INTO `inscripciones`.`materias` (`nombre_materia`, `codigo_materia`, `creditos`, `idcarrera`) VALUES ('Base de Datos', 'bs726383', '4', '1');
INSERT INTO `inscripciones`.`materias` (`nombre_materia`, `codigo_materia`, `creditos`, `idcarrera`) VALUES ('Redes emergentes', 'RE522288', '5', '1');
INSERT INTO `inscripciones`.`materias` (`nombre_materia`, `codigo_materia`, `creditos`, `idcarrera`) VALUES ('Telecomunicaiones', 'T5273929', '4', '1');
INSERT INTO `inscripciones`.`materias` (`nombre_materia`, `codigo_materia`, `creditos`, `idcarrera`) VALUES ('DevOps', 'DO97732', '5', '1');
