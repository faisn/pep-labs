create table Post ( id serial primary key, post varchar(255) ,  artist_fk INT REFERENCES artist(id))