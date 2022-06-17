
Insert into cursos ( nombre, descripcion) VALUES ( 'alfa', 'los mas aplicados') ,( 'beta', 'los mas inteligentes'), ( 'gamma', 'los mas astutos');

Insert into registros ( codigo_registro, rut) VALUES ( 'ZP202201', '123456-7'), ( 'AP202202', '234567-8'), ( 'TL202203', '345678-9') ;
Insert into direcciones ( nombre, numero, ciudad) VALUES ( 'Prat', '123', 'Arica') ,( 'Bulnes', '123', 'Punta Arenas'), ( 'Arana', '123', 'Concepcion');
Insert into alumnos ( nombre, apellido, edad, curso_id, registro_id, direccion_id ) VALUES 
( 'Zoe', 'Palma', 3, 1, 3, 1) ,
( 'Ayun', 'Palma', 3, 1, 3, 2), 
( 'Tom', 'Loren', 5, 3, 1, 3);
--Insert into Cursos ( nombre, descripcion) VALUES ( 'beta', 'los mas inteligentes');
--Insert into Cursos ( nombre, descripcion) VALUES ( 'gamma', 'los mas astutos');

--Insert into Alumnos ( nombre, apellido, edad, curso_id, registro_id, direccion_id) VALUES ( 'Zoe', 'Palma', 3, 1, 3, 1);
--Insert into Alumnos ( nombre, apellido, edad, curso_id, registro_id, direccion_id) VALUES ( 'Ayun', 'Palma', 3, 1, 3, 2);
--Insert into Alumnos ( nombre, apellido, edad, curso_id, registro_id, direccion_id) VALUES ( 'Tom', 'Loren', 5, 3, 1, 3);
--Insert into Registros ( cod_reg, rut) VALUES ( 'ZP202201', '123456-7');
--Insert into Registros ( cod_reg, rut) VALUES ( 'AP202202', '234567-8');
--Insert into Registros ( cod_reg, rut) VALUES ( 'TL202203', '345678-9');
--Insert into Direcciones ( calle, num, ciudad, region, pais) VALUES ( 'Prat', 123, 'Arica', 1, 1);
--Insert into Direcciones ( calle, num, ciudad, region, pais) VALUES ( 'Bulnes', 123, 'Punta Arenas', 12, 1);
--Insert into Direcciones ( calle, num, ciudad, region, pais) VALUES ( 'Arana', 123, 'Concepcion', 8, 1);