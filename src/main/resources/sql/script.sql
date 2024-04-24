CREATE TABLE EMPLOYEE (
    EMPLOYEE_ID integer not null auto_increment,
    FULL_NAME VARCHAR(200),
    START_DATE TIMESTAMP,
    PRIMARY KEY(EMPLOYEE_ID)
    -- adding unique constraint
);