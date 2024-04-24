package org.example.training;

import org.example.training.conf.DatabaseConfiguration;
import org.example.training.models.Employee;
import org.example.training.repositories.EmployeeRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) throws SQLException {

        //data to save
        Employee employee = new Employee();
        employee.setFullName("RABEARIMANANA Andy Natana");
        employee.setStartDate(LocalDateTime.now());

        //obtaining connection from database
        //saving new employee
        EmployeeRepository employeeRepository = new EmployeeRepository(new DatabaseConfiguration());
        //employeeRepository.insert(employee);

        employee.setFullName("Anjara Sitraka Fenotiana");
        employee.setId(5L);
        employeeRepository.update(employee);
    }
}
