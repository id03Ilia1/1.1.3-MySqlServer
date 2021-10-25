--CREATE TABLE `mydbtest`.`users` (
--  `id` INT NOT NULL,
--  `name` VARCHAR(45) NOT NULL,
--  `lastname` VARCHAR(45) NOT NULL,
--  `age` INT NOT NULL,
--  PRIMARY KEY (`id`))
--ENGINE = InnoDB
--DEFAULT CHARACTER SET = utf8;

--insert into users (id, name, lastname, age) values(2,'Alex','Rubanov',30);
select * from users;
--#select name from users where id =1;
--#update users set name = 'Bob' where id =1;
--#delete from users