package day4.collections.maps.demos.demo1;

import day4.collections.maps.demos.demo1.model.Employee;
import day4.collections.maps.demos.demo1.model.Project;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        Map<Project, List<Employee>> map = new HashMap<>();

        Project p1 = new Project("BankApp", 45);
        Project p2 = new Project("Insurance", 35);

        Employee e1 = new Employee("mike", 100);
        Employee e2 = new Employee("john", 50);
        Employee e3 = new Employee("jack", 500);


        List<Employee> p1Employees = Arrays.asList(e1);
        List<Employee> p2Employees = Arrays.asList(e2, e3);

        map.put(p1, p1Employees);
        map.put(p2, p2Employees);

        print(p1Employees);
        print(p2Employees);

        for (Map.Entry<Project, List<Employee>> entry : map.entrySet()) {
            Project p = entry.getKey();
            List<Employee> allEmployees = entry.getValue();

            System.out.println(p);
            System.out.println(allEmployees);

        }
    }

    public static void print(Collection<Employee> collection) {
        Iterator<Employee> itr = collection.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e);
        }
    }
}
