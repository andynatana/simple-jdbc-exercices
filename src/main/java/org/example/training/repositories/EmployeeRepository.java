package org.example.training.repositories;

import org.example.training.conf.DatabaseConfiguration;
import org.example.training.models.Employee;

import java.sql.*;

public class EmployeeRepository {

    private final DatabaseConfiguration databaseConfiguration;

    public EmployeeRepository(DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    public void insert(Employee employee) throws SQLException {
        //preparing data
        Connection connection = this.databaseConfiguration.getConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO EMPLOYEE(FULL_NAME,START_DATE) VALUES(?,?)");
        statement.setString(1, employee.getFullName());
        statement.setTimestamp(2, Timestamp.valueOf(employee.getStartDate()));

        //execute statement
        statement.execute();

        //closing resources
        statement.close();
        connection.close();
        System.out.println("Employee created !");
    }

    public void update(Employee employee) throws SQLException {
        Connection connection = this.databaseConfiguration.getConnection();
        PreparedStatement statement = connection.prepareStatement("UPDATE EMPLOYEE SET FULL_NAME = ? , START_DATE = ? WHERE EMPLOYEE_ID = ?");
        statement.setString(1, employee.getFullName());
        statement.setTimestamp(2, Timestamp.valueOf(employee.getStartDate()));
        statement.setLong(3, employee.getId());

        //execute statement
        statement.execute();

        //closing resources
        statement.close();
        connection.close();
        System.out.println("Employee udpated !");
    }

    public void delete(Long id) {
        //todo delete
    }
}
