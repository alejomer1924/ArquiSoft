# ArquiSoft   

Integrantes: 

-Alejandro Mercado Espinosa
-Daniel Esteban Burbano Argothy 
-Joiner Herrera 
-Santiago Escobar
-Cristian Henao


Data Definition Language BBDD: 

CREATE TABLE curriculum_vitae(
nro_cv            INT NOT NULL AUTO_INCREMENT,
nombre            VARCHAR(30) NOT NULL,
apellido          VARCHAR(30) ,
edad              INT,
sexo              CHAR(1),
email             VARCHAR(50),
nro_contacto      INT,
nombre_ref_lab    VARCHAR(50),  
nro_ref_lab       INT,
estudios             VARCHAR(255),
experiencia       VARCHAR(255),
PRIMARY KEY (nro_cv)
);
