
--INSERT INTO HERO(name, alias,url_image) 
--VALUES('Toshinori Yagi','All Might','https://static.wikia.nocookie.net/bokunoheroacademia/images/c/cd/Toshinori_Yagi_Golden_Age_Hero_Costume_%28Anime%29.png/revision/latest/scale-to-width-down/407?cb=20190129015644');

--INSERT INTO HERO(name, alias,url_image) 
--VALUES('Shota Aizawa','Eraser Head','https://static.wikia.nocookie.net/bokunoheroacademia/images/8/82/Shota_Aizawa_Hero_Costume_%28Anime%29.png/revision/latest/scale-to-width-down/162?cb=20160521035900');

INSERT INTO HERO(name, alias,url_image) 
VALUES('Fumikage Tokoyami','Tsukuyomi','https://static.wikia.nocookie.net/bokunoheroacademia/images/b/ba/Fumikage_Tokoyami_Uniform.png/revision/latest/scale-to-width-down/181?cb=20200519142933');


--INSERT INTO QUIRK(name, hero_id) 
--VALUES('One For All',1);

--INSERT INTO QUIRK(name, hero_id) 
--VALUES('Erasure',2);

INSERT INTO QUIRK(name, hero_id) 
VALUES('Dark Shadow',1);

INSERT INTO SKILL (name,description,hero_id)
VALUES('Abyssal Talons','Tokoyami commands Dark Shadow to burrow into the ground and reach up toward nearby enemies with dark talons.',1)
,('Night Hunter','Tokoyami unleashes Dark Shadow to grab prey from a distance with dark talons.',1)
,('Shadow Frenzy','Tokoyami and Dark Shadow seize every opportunity to attack.',1)
,('Shadow Latch','Tokoyami releases a small portion of Dark Shadow',1)
,('Shadow Liberation','Tokoyami materializes the power of Dark Shadow to launch a multi-stage attack.',1)
,('Shadow Nature','Tokoyami draws in the darkness arounnd him.',1)
