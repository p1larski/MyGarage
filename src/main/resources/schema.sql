DROP TABLE IF EXISTS cars CASCADE;
CREATE TABLE cars(
        id INT PRIMARY KEY,
        odometer integer,
        descriptionOfMalfunction VARCHAR(255),
        dateOfArrival TIMESTAMP);