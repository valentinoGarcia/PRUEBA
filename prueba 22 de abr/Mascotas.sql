create table Mascota (
	id_mascota INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	edad INT ,
    peso INT ,
    id_vet INT NOT NULL
);

insert into Mascota (edad, peso, id_vet) values ( 2, 6, 16);
insert into Mascota (edad, peso, id_vet) values ( 2, 10, 17);
insert into Mascota (edad, peso, id_vet) values ( 2, 5, 18);
insert into Mascota (edad, peso, id_vet) values ( 2, 2, 2);
select * from Mascota order by edad;
select * from Mascota order by peso;


select sum(peso) from Mascota where edad > 5 and edad < 10;
select avg(peso) from Mascota;


DELIMITER $$
CREATE PROCEDURE Cantidad_de_Mascotas(IN dueno INT, OUT cantidad INT)
BEGIN
DECLARE cantidad int; 
set cantidad = (select count(id_dueno) from Duenos where id_dueno = dieno);
    
END$$

DELIMITER //

CREATE PROCEDURE PesaMasDe15kg(IN mascota INT)
BEGIN
	DECLARE PesaMas BOOLEAN;
    set PesaMas = false;
    if ((select peso from Mascotas where id_mascota = mascota) > 15 ) THEN
	set PesaMas = True;
    END if;
    
	SELECT PesaMas;
END//



DELIMITER //
CREATE PROCEDURE PesaMas(IN peso_ingresado INT)
	BEGIN
	select * from Mascotas where peso >= peso_ingresado;
	
END//

call PesaMas(6);


