package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

    public static void main(String args[]) {
        Employee employee1 = new Employee(1, "Chandu", "HYD");
        Employee employee2 = new Employee(1, "Bhandu", "HYD");
        Employee employee3 = new Employee(1, "Ghandu", "HYD");
        Employee employee4 = new Employee(1, "Chandu", "Bang");
        Employee employee5 = new Employee(1, "Chandu", "Bang");
        Employee employee6 = new Employee(1, "Chandu", "Chen");

        List<Employee> employeesList = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        List<String> names = employeesList.stream().filter(e -> e.getCity().equals("HYD")).sorted(Comparator.comparing(e->e.getName())).map(e-> e.getName()).collect(Collectors.toList());


        names.forEach(System.out::println);
    }

    public static class Employee {
        int id;
        String name;
        String city;

        public Employee(int id, String name, String city) {
            this.id = id;
            this.name = name;
            this.city = city;

        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
