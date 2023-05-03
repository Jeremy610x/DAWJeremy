CREATE USER 'pokemonusr'@'localhost' IDENTIFIED BY 'pokemonpsw';
CREATE DATABASE pokemondb
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
GRANT SELECT, INSERT, UPDATE, DELETE ON storedb.* TO 'pokemonusr'@'localhost';
USE pokemondb;
CREATE TABLE `pokemontypes` (
    `id` INT(4) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(10) NOT NULL UNIQUE,
    `attack` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE `pokemons` (
    `id` INT(4) NOT NULL,
    `name` VARCHAR(10) NOT NULL UNIQUE,
    `height` DOUBLE DEFAULT 0.0,
    `weight` DOUBLE DEFAULT 0.0,
    `genre` ENUM('male', 'female', 'both'),
    `category_id` INT(4),
    PRIMARY KEY (`id`)
);
/*Faltaria si lo implementais, añadir una columna a la tabla para poder reflejar al pokemon que evoluciona y la constraint correspondiente*/
ALTER TABLE `pokemons` 
    ADD CONSTRAINT `fk_pokemontypes` FOREIGN KEY (category_id) 
    REFERENCES pokemon(id)
    ON UPDATE CASCADE ON DELETE RESTRICT;
/*falta definir constraint para el tema de la evolución*/

INSERT INTO pokemontypes VALUES 
    (1, "Planta", "category01");
INSERT INTO pokemons VALUES 
    (1, "Bulbasur", 0.7, 6.9, 'both', 1);
