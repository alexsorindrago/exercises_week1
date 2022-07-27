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


        service.create(new Employee(1L, "Jack", 500));
        service.create(new Employee(2L, "Sparrow", 5000));
        service.create(new Employee(3L, "Frodo", 50000));
        service.create(new Employee(4L, "Smeagol", 50000));
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

        service.assignProjectToEmployee(2L, rings.getProjectName());
        System.out.println("----------------------");


    }

}



