create table Post( 
    id serial primary key, 
    post varchar(255), 
    artist_fk int references site_user(id)
);