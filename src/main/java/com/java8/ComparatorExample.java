package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Employee> comparatorByName
                = Comparator.comparing(Employee::getName);
        List<Employee> unsortedEmployeeList =
                Arrays.asList(new Employee("chandu", 1, "Itb", 2000011.00),
                        new Employee("chandu", 2, "Ita", 200002.00),
                        new Employee("chandub", 3, "Itc", 200003.00),
                        new Employee("chanduc", 4, "Itd", 200004.00),
                        new Employee("chandud", 5, "Ite", 200005.00));

        List<Employee> sortedList = unsortedEmployeeList.stream()
                .sorted(comparatorByName)
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);


        sortedList = unsortedEmployeeList.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);


        List<String> names = unsortedEmployeeList.stream().
                map(Employee::getName)
                .collect(Collectors.toList());
        names.forEach(System.out::println);

        List<Employee> employees = unsortedEmployeeList.stream()
                .filter(e -> e.getSalary() > 200003.00)
                .collect(Collectors.toList());
        employees.forEach(System.out::println);

        names = unsortedEmployeeList.stream()
                .filter(e -> e.getId() > 2)
                .map(Employee::getName)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
