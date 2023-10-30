CREATE TABLE Homework
(
    id          INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(256) NOT NULL,
    description VARCHAR(256) NOT NULL
);

CREATE TABLE Lesson
(
    id          INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(256) NOT NULL,
    updateAt    TIMESTAMP    NOT NULL,
    homework_id INT          NOT NULL,
    FOREIGN KEY (homework_id) REFERENCES Homework (id)
);

CREATE TABLE Schedule
(
    id        INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(256) NOT NULL,
    undatedAt TIMESTAMP    NOT NULL
);

CREATE TABLE Lesson_Schedule
(
    lesson_id   INT NOT NULL,
    schedule_id Int NOT NULL,
    FOREIGN KEY (lesson_id) REFERENCES Lesson (id),
    FOREIGN KEY (schedule_id) REFERENCES Schedule (id),
    PRIMARY KEY (lesson_id, schedule_id)
);

INSERT INTO Homework(name, description)
VALUES ('Alex', 'student1'),
       ('Bob', 'student2'),
       ('Jake', 'student3');

INSERT INTO Lesson (name, updateAt, homework_id)
VALUES ('Lesson 1', NOW(), 1),
       ('Lesson 2', NOW(), 2),
       ('Lesson 3', NOW(), 3);

INSERT INTO Schedule (name, undatedAt)
VALUES ('Schedule 1', NOW()),
       ('Schedule 2', NOW());

INSERT INTO Lesson_Schedule (lesson_id, schedule_id)
VALUES (1, 1),
       (1, 2),
       (2, 2),
       (3, 1);