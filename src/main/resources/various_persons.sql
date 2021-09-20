CREATE SCHEMA netology;

CREATE TABLE netology.various_persons
(
    id             INTEGER,
    name           VARCHAR(255),
    surname        VARCHAR(255),
    age            INT,
    phone_number   INT,
    city_of_living VARCHAR(255),
    CONSTRAINT firstKeyP PRIMARY KEY (name, surname, age)
);

INSERT INTO netology.various_persons
VALUES (1, 'Ben', 'Kenobi', 70, 66, 'Stewjon'),
       (2, 'Vasya', 'Wasonkin', 18, 551477, 'Moscow');


