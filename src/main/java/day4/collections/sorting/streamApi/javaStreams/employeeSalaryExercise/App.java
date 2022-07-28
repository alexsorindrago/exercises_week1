package day4.collections.sorting.streamApi.javaStreams.employeeSalaryExercise;

import day4.collections.sorting.streamApi.javaStreams.employeeSalaryExercise.model.EmployeeModel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        EmployeeModel e1 = new EmployeeModel(1L, "jack", 500, "pirates");
        EmployeeModel e2 = new EmployeeModel(2L, "jill", 200, "matrix 4");
        EmployeeModel e3 = new EmployeeModel(3L, "hodor", 1000, "door");
        EmployeeModel e4 = new EmployeeModel(4L, "frodo", 600, "ringbearer");

        Stream<EmployeeModel> employeeStream = Stream.of(e1, e2, e3, e4);

        EmployeeModel minimum = employeeStream.min((x, y) -> (x.salary - y.salary)).get();
        System.out.println(minimum);

        System.out.println(" ----------------------------- ");

        Stream<EmployeeModel> employeeStream2 = Stream.of(e1, e2, e3, e4);
        EmployeeModel max = employeeStream2.max((x, y) -> (x.salary - y.salary)).get();
        System.out.println(max);


        System.out.println(" ----------------------------- ");

        Stream<EmployeeModel> employeeStream3 = Stream.of(e1, e2, e3, e4);
        List<EmployeeModel> listOfEmployees = employeeStream3.collect(Collectors.toList());

        listOfEmployees.stream()
                .filter(employee -> employee.getProject().equals("pirates"))
                .map(employeeModel -> {
                    int salary = e1.getSalary();
                    employeeModel.setSalary(salary + 1000);
                    return employeeModel;
                });
        System.out.println(listOfEmployees);


    }


}
