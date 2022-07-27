package day3.collections.exercise1.employee_app;

import day3.collections.exercise1.employee_app.exception.EmployeeNotFoundException;
import day3.collections.exercise1.employee_app.model.Employee;
import day3.collections.exercise1.employee_app.model.Project;
import day3.collections.exercise1.employee_app.service.EmployeeService;
import day3.collections.exercise1.employee_app.service.ProjectService;

public class EmployeeApp {

    public static void main(String[] args) throws EmployeeNotFoundException {
//        1. Filter employess based on salary
//        2. Filter employees based on Project
//        3. Update employee salary based on Id
//        4. Create employees
//        5. Allocate project to employees
        Project pirates = new Project("Lord of the Pirates");
        Project rings = new Project("Rings of the Carribean");

        EmployeeService service = new EmployeeService();
        ProjectService projectService = new ProjectService();

        projectService.create(pirates);
        System.out.println("----------------------");
        projectService.create(rings);
        System.out.println("----------------------");

        Employee e1 = new Employee(1L, "Jack", 500);
        Employee e2 = new Employee(2L, "Sparrow", 5000);
        Employee e3 = new Employee(3L, "Frodo", 50000);
        Employee e4 = new Employee(4L, "Smeagol", 50000);

        service.create(e1);
        service.create(e2);
        service.create(e3);
        service.create(e4);
        System.out.println("----------------------");

        service.getEmployeesBySalary(50000);
        System.out.println("----------------------");

        service.getEmployeesByProjectName(pirates.getProjectName());
        System.out.println("----------------------");

        service.getEmployeeByID(1L);
        System.out.println("----------------------");

        service.updateEmployeeSalary(2L, 500);
        System.out.println("----------------------");

        service.deleteEmployee(2L);
        System.out.println("----------------------");

        service.assignProjectToEmployee(e2, rings);
        System.out.println("----------------------");

        service.assignProjectToEmployee(e3, rings);
        System.out.println("----------------------");

    }

}



