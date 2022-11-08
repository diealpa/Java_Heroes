CREATE TABLE IF NOT EXISTS persona
(
id_persona INT NOT NULL,
nombre VARCHAR(25) NOT NULL,
apellido VARCHAR(25) NOT NULL,
PRIMARY KEY(id_persona)
);

CREATE TABLE IF NOT EXISTS telefono
(
id_telefono INT NOT NULL,
numero VARCHAR(25) NOT NULL,
id_persona INT NOT NULL,
FOREIGN KEY (id_persona) REFERENCES persona(id_persona) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY(id_telefono)
);

CREATE INDEX i_persona ON telefono(id_persona);

insert into persona(id_persona,nombre,apellido)values(1,'Romero','Santos');
insert into persona(id_persona,nombre,apellido)values(2,'Rosa','Genova');
insert into persona(id_persona,nombre,apellido)values(3,'Samuel','Mayor');
insert into persona(id_persona,nombre,apellido)values(4,'Maria','Quintana');
insert into persona(id_persona,nombre,apellido)values(5,'Roberto','Palacios');

insert into telefono(id_telefono,numero,id_persona)values(1,'176543897',5);
insert into telefono(id_telefono,numero,id_persona)values(2,'836343897',4);
insert into telefono(id_telefono,numero,id_persona)values(3,'176548876',3);
insert into telefono(id_telefono,numero,id_persona)values(4,'539873566',2);
insert into telefono(id_telefono,numero,id_persona)values(5,'973649786',1);