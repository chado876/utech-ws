INSERT INTO tutor(id,first_name,last_name)
    VALUES (
    '0ae8868c-2866-4e35-8083-31a279f88d7c',
     'John',
     'Doe'
    );

INSERT INTO tutor(id,first_name,last_name)
    VALUES (
    '3a8bcc1b-979b-4379-998e-225449c4bbf0',
     'Jane',
     'Doe'
    );

INSERT INTO module(id,module_code,name,credits,cost,tutor_id)
VALUES (
    'd35930a9-bf9c-4d5d-9394-9e27f2ca120b',
    'CIT3003',
    'Analysis of Algorithms',
    3,
    36700,
    '0ae8868c-2866-4e35-8083-31a279f88d7c'
    );

INSERT INTO module(id,module_code,name,credits,cost,tutor_id)
VALUES (
    '903f0260-5769-4f64-bb1a-26939282e1a8',
    'CIT3006',
    'Theory of Computation',
    3,
    36700,
    '0ae8868c-2866-4e35-8083-31a279f88d7c'
    );

INSERT INTO module(id,module_code,name,credits,cost,tutor_id)
VALUES (
    '777974f8-e524-4824-b4df-1683a662c75b',
    'CMP4011',
    'Artificial Intelligence',
    4,
    47200,
    '3a8bcc1b-979b-4379-998e-225449c4bbf0'
    );

INSERT INTO module(id,module_code,name,credits,cost,tutor_id)
VALUES (
    '8a77501e-3bd3-4ec8-a418-eeb5e6bd7b59',
    'CMP4004',
    'Analysis of Programming Languages',
    4,
    47200,
    '3a8bcc1b-979b-4379-998e-225449c4bbf0'
    );