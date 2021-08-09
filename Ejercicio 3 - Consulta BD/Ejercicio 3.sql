CREATE DATABASE escuela;

CREATE TABLE alumnos (alumno_id INT NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(50), 
PRIMARY KEY (alumno_id));

CREATE TABLE materias (materia_id INT NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(20),
PRIMARY KEY(materia_id));

CREATE TABLE calificaciones (alumno_id INT NOT NULL, 
materia_id INT NOT NULL,
calificacion DECIMAL(3,1),
PRIMARY KEY (alumno_id, materia_id),
FOREIGN KEY (alumno_id) REFERENCES alumnos(alumno_id),
FOREIGN KEY (materia_id) REFERENCES materias(materia_id));


INSERT INTO alumnos (nombre) VALUES ("Kevin Amillano");
INSERT INTO alumnos (nombre) VALUES ("Osvaldo López");
INSERT INTO alumnos (nombre) VALUES ("Maria Perez");
INSERT INTO alumnos (nombre) VALUES ("Juan Gallardo");
INSERT INTO alumnos (nombre) VALUES ("Roberto Millan");
INSERT INTO alumnos (nombre) VALUES ("Karla Quiroz");
INSERT INTO alumnos (nombre) VALUES ("Martha Suarez");
INSERT INTO alumnos (nombre) VALUES ("Anahi Rodriguez");
INSERT INTO alumnos (nombre) VALUES ("Marco Palazuelos");
INSERT INTO alumnos (nombre) VALUES ("Telma Duarte");
INSERT INTO alumnos (nombre) VALUES ("Samuel Camacho");
INSERT INTO alumnos (nombre) VALUES ("Raul Nevada");
INSERT INTO alumnos (nombre) VALUES ("Jorge Cerros");
INSERT INTO alumnos (nombre) VALUES ("Lucia Reynosa");
INSERT INTO alumnos (nombre) VALUES ("Eva Meza");
INSERT INTO alumnos (nombre) VALUES ("Xochitl Zaragoza");
INSERT INTO alumnos (nombre) VALUES ("Emiliano Robles");
INSERT INTO alumnos (nombre) VALUES ("Rafael Juarez");
INSERT INTO alumnos (nombre) VALUES ("Miguel Hernandez");
INSERT INTO alumnos (nombre) VALUES ("Ignacio Pavon");

SELECT * FROM alumnos;



INSERT INTO materias (nombre) VALUES ("Matematicas");
INSERT INTO materias (nombre) VALUES ("Español");
INSERT INTO materias (nombre) VALUES ("Historia");
INSERT INTO materias (nombre) VALUES ("Artes");
INSERT INTO materias (nombre) VALUES ("Computación");

SELECT * FROM materias



INSERT INTO calificaciones VALUES(1, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(1, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(1, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(1, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(1, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(2, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(2, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(2, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(2, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(2, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(3, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(3, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(3, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(3, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(3, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(4, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(4, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(4, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(4, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(4, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(5, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(5, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(5, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(5, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(5, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(6, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(6, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(6, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(6, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(6, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(7, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(7, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(7, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(7, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(7, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(8, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(8, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(8, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(8, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(8, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(9, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(9, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(9, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(9, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(9, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(10, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(10, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(10, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(10, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(10, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(11, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(11, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(11, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(11, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(11, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(12, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(12, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(12, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(12, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(12, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(13, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(13, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(13, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(13, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(13, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(14, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(14, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(14, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(14, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(14, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(15, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(15, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(15, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(15, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(15, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(16, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(16, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(16, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(16, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(16, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(17, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(17, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(17, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(17, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(17, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(18, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(18, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(18, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(18, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(18, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(19, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(19, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(19, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(19, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(19, 4, FLOOR(RAND()*(10-1+1))+1);

INSERT INTO calificaciones VALUES(20, 2, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(20, 3, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(20, 5, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(20, 1, FLOOR(RAND()*(10-1+1))+1);
INSERT INTO calificaciones VALUES(20, 4, FLOOR(RAND()*(10-1+1))+1);

SELECT a.nombre, (SUM(calificacion) / COUNT(m.nombre))
FROM calificaciones c
RIGHT JOIN alumnos a ON  c.alumno_id = a.alumno_id
RIGHT JOIN materias m ON m.materia_id = c.materia_id
GROUP BY a.nombre

SELECT a.nombre, FORMAT((SUM(c.calificacion)/COUNT(m.materia_id)), 2) AS "Promedio"
FROM alumnos a 
LEFT JOIN calificaciones c ON c.alumno_id = a.alumno_id
RIGHT JOIN materias m ON m.materia_id = c.materia_id
GROUP BY a.alumno_id
ORDER BY FORMAT((SUM(c.calificacion)/COUNT(m.materia_id)), 2) DESC
LIMIT 10;
