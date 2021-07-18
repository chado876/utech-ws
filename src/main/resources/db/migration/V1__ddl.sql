CREATE TABLE tutor
(
    id UUID NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE module
(
    id UUID NOT NULL,
    module_code VARCHAR(10),
    name VARCHAR(50),
    credits INTEGER NOT NULL,
    cost FLOAT NOT NULL,
    tutor_id UUID,
    PRIMARY KEY (id)
);

ALTER TABLE module
    ADD CONSTRAINT fk_module_tutor FOREIGN KEY (tutor_id) REFERENCES tutor;

