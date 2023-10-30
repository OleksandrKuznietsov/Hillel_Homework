CREATE TABLE Homework
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(256),
    description TEXT

);



CREATE TABLE Lesson
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(256),
    updatedAt   DATE,
    homework_id INT,
    FOREIGN KEY (homework_id) REFERENCES Homework (id)
);

DROP TABLE Lesson;

DROP TABLE Homework;



