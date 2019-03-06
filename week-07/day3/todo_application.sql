SHOW databases;

SET SQL_SAFE_UPDATES = 0;

CREATE DATABASE todo_application;

USE todo_application;

CREATE TABLE apprentices (
  firstname VARCHAR(255),
  lastname VARCHAR(255)
);

ALTER TABLE apprentices ADD COLUMN
  id INT PRIMARY KEY AUTO_INCREMENT;
  
CREATE TABLE tasks (
	id INT PRIMARY KEY AUTO_INCREMENT,
	descripton VARCHAR(200) 
);

CREATE TABLE todos (
	id INT AUTO_INCREMENT,
    apprentice_id INT,
    deadline DATE,
    status ENUM('Todo', 'Doing', 'Review', 'Done'),
    PRIMARY KEY (id),
    FOREIGN KEY (apprentice_id) REFERENCES apprentices (id)
    );
    
ALTER TABLE todos 
ADD COLUMN
task_id INT;

SHOW tables;

SELECT * FROM todos;

INSERT INTO tasks 
VALUES (
(NULL, 'wake up'),
(NULL, 'have breakfast')
);

DROP TABLE tasks;

CREATE TABLE tasks (
id INT auto_increment,
description VARCHAR(200),
PRIMARY KEY (id)
);

ALTER TABLE todos 
ADD FOREIGN KEY
(task_id) REFERENCES tasks (id);

INSERT INTO tasks 
VALUES (
(NULL, 'wake up'),
(NULL, 'have breakfast'),
(NULL, 'feed the cow')
);

INSERT INTO apprentices
VALUES (
('XY', 'ZZ', NULL),
('Ehh', 'Nyehh', NULL)
);


