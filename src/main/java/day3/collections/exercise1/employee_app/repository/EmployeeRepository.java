package day3.collections.exercise1.employee_app.repository;

import day3.collections.exercise1.employee_app.exception.EmployeeNotFoundException;
import day3.collections.exercise1.employee_app.model.Employee;
import day3.collections.exercise1.employee_app.model.Project;

import java.util.List;

public interface EmployeeRepository {

    void create(Employee employee);

    void updateEmployeeSalary(Long id, Integer salary);

    void deleteEmployee(Long id) throws EmployeeNotFoundException;

    Employee getEmployeeByID(Long id);

    List<Employee> getAllEmployees();

    List<Employee> getEmployeesBySalary(Integer salary);

    List<Employee> getEmployeesByProjectName(String projectName);

    void assignProjectToEmployee(Employee employee, Project project);

}
