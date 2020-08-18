DROP TABLE Questions IF EXISTS;

CREATE TABLE Questions (
    id IDENTITY PRIMARY KEY,
    question VARCHAR(8000),
    a VARCHAR(255),
    b VARCHAR(255),
    c VARCHAR(255),
    d VARCHAR(255),
    right_an VARCHAR(255),
    tags VARCHAR(255)
);