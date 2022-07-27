package day3.collections.exercise1.employee_app.service;

import day3.collections.exercise1.employee_app.exception.EmployeeNotFoundException;
import day3.collections.exercise1.employee_app.model.Employee;
import day3.collections.exercise1.employee_app.model.Project;
import day3.collections.exercise1.employee_app.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeService implements EmployeeRepository {
    private final Map<Long, Employee> employeeMap;
    private final Set<Project> projects;

    public EmployeeService() {
        this.employeeMap = new HashMap<>();
        this.projects = new HashSet<>();
    }

    @Override
    public void create(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        projects.add(employee.getProject());
        System.out.println("Welcome new employee!: " + employee);
    }

    @Override
    public void updateEmployeeSalary(Long id, Integer salary) {
        Employee employeeToUpdate = employeeMap.get(id);
        employeeToUpdate.setSalary(salary);
        Employee updatedEmployee = employeeMap.get(id);
        System.out.println("salary was updated: " + updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) throws EmployeeNotFoundException {
        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.remove(id);
            System.out.println(employee + " has left the building :( ");
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        Employee employee = employeeMap.get(id);
        System.out.println("employee by id: " + employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public List<Employee> getEmployeesBySalary(Integer salary) {
        List<Employee> employeeList = new ArrayList<>(employeeMap.values());
        List result = employeeList.stream().filter(employee -> Objects.equals(employee.getSalary(), salary)).collect(Collectors.toList());
        System.out.println("these guys earn the same: " + result);
        return result;
    }

    @Override
    public List<Employee> getEmployeesByProjectName(String projectName) {
        List result = new ArrayList();
        try {
            List<Employee> employeeList = new ArrayList<>(employeeMap.values());
            result = employeeList.stream().filter(employee -> Objects.equals(employee.getProject().getProjectName(), projectName)).collect(Collectors.toList());
            System.out.println("The following are on the same project: " + result);
        } catch (Exception e) {
            System.out.println("oops! no employees assigned to same project");
        }
        return result;
    }

    //TODO: fix this
    @Override
    public void assignProjectToEmployee(Long id, String projectName) {
        Employee employee = employeeMap.get(id);
        try {
            Optional<Project> isPresent = projects.stream().filter(project -> project.getProjectName().equals(projectName)).findAny();
            employee.setProject(isPresent.get());
        } catch (Exception e) {
            System.out.println("oops! project " + projectName + " does not exist yet.");
        }
    }
}
