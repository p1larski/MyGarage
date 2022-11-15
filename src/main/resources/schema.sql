DROP TABLE IF EXISTS cars CASCADE;
CREATE TABLE cars(
        id INT PRIMARY KEY,
        odometer integer,
        description TEXT,
        dateOfArrival TIMESTAMP);