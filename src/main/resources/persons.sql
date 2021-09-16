CREATE SCHEMA netology;

CREATE TABLE netology.persons
(
    name           VARCHAR(255),
    surname        VARCHAR(255),
    age            INT,
    phone_number   INT,
    city_of_living VARCHAR(255),
    CONSTRAINT firstKeyP PRIMARY KEY (name, surname, age)
);

INSERT INTO netology.persons
VALUES ('Ben', 'Kenobi', 70, 66, 'Stewjon'),
       ('Vasya', 'Wasonkin', 18, 551477, 'Moscow');


