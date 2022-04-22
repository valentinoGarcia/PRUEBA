create table Duenos (
	id_dueno INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	id_mascota INT NOT NULL,
    nombre VARCHAR(50)
);

DELIMITER // 
CREATE PROCEDURE Mascotas_del_dueno(IN amo INT)
BEGIN
select * from Duenos where id_dueno = amo;

END //

