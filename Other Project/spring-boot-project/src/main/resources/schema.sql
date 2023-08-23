CREATE TABLE users (
    id INT NOT NULL,
    name VARCHAR(255),
    address VARCHAR(255)
);

ALTER TABLE users ADD CONSTRAINT users_pk PRIMARY KEY (id);