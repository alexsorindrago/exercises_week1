package day3.collections.exercise1.employee_app.service;

import day3.collections.exercise1.employee_app.exception.EmployeeNotFoundException;
import day3.collections.exercise1.employee_app.model.Employee;
import day3.collections.exercise1.employee_app.model.Project;
import day3.collections.exercise1.employee_app.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService implements EmployeeRepository {

    private final List<Employee> employeesDB;

    public EmployeeService() {
        this.employeesDB = new ArrayList<>();
    }

    @Override
    public void create(Employee employee) {
        employeesDB.add(employee);
        if (employeesDB.contains(employee)) {
            System.out.println("added new employee: " + employee);
        } else {
            System.out.println("something went wrong, employee was not added");
        }
    }

    @Override
    public void updateEmployeeSalary(Long id, Integer salary) {
        Employee employeeToUpdate = employeesDB.stream().filter(found -> found.getId().equals(id)).findAny().get();
        employeeToUpdate.setSalary(salary);

        Employee updatedEmployee = employeesDB.stream().filter(found -> found.getId().equals(id)).findAny().get();
        System.out.println("salary was updated: " + updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) throws EmployeeNotFoundException {
        Employee employee = null;
        if (employeesDB.contains(employeesDB.stream().filter(found -> found.getId().equals(id)).findAny().get())) {
            employee = employeesDB.stream().filter(found -> found.getId().equals(id)).findAny().get();
            employeesDB.remove(employee);
            System.out.println(employee + " has left the building :( ");
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        Employee employee = employeesDB.stream().filter(found -> found.getId().equals(id)).findAny().get();
        System.out.println("employee by id: " + employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = employeesDB;
        return list;
    }

    @Override
    public List<Employee> getEmployeesBySalary(Integer salary) {
        List result = employeesDB.stream().filter(employee -> Objects.equals(employee.getSalary(), salary)).collect(Collectors.toList());
        System.out.println("these guys earn the same: " + result);
        return result;
    }

    @Override
    public List<Employee> getEmployeesByProjectName(String projectName) {
        List result = employeesDB.stream()
                .filter(employee -> Objects.equals(employee.getProject().getProjectName(), projectName))
                .collect(Collectors.toList());
        System.out.println("The following are on the same project: " + result);

        return result;
    }

    @Override
    public void assignProjectToEmployee(Employee employee, Project project) {
        ;
        employee.setProject(project);
        System.out.println(project + " was added to " + employee);
    }
}
