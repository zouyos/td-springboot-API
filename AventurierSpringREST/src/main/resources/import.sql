INSERT INTO TYPE_ARME (type,degat_min,degat_max) VALUES ('Arc',1,6),('Epée',1,8),('Hache',1,8),('Dague',2,4);

INSERT INTO qualite (nom,bonus,couleur) values ( 'Commun',0,'#BABABA' ),( 'Rare',1,'#43F667'),( 'Epic',2,'#F643F6'),( 'Legendaire',3,'#F5A52E');
INSERT INTO aventurier (nom, hp_Max, hp, atq, def) VALUES ('Gimli', 200, 100, 3, 5),('Aragorn',125,125,4,4),('Legolas',100,25,5,2);
INSERT INTO ARME (AVENTURIER_ID,QUALITE_ID,TYPE_ARME_ID) VALUES (2,1,1),(3,4,1),(2,4,2),(1,3,3),(1,2,3),(2,2,4),(3,1,4);

update aventurier set arme_id =2 where id=3;
update aventurier set arme_id =3  where id=2;
update aventurier set arme_id =4  where id=1;