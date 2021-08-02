package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JPMInterview {

    public static void main(String[] args) {
        List<String> skills1 = Arrays.asList("Java", "CPP", "C");

        List<String> skills2 = Arrays.asList("Java", "CPP", "C", "Python", "GO");

        List<Employee> employees = Arrays.asList(new Employee(skills1, "HR"), new Employee(skills2, "IT"));

        Department department = new Department();
        department.setEmployees(employees);
        department.setDepartment("HR");
        System.out.println(findUniqueSkillSet(department));

        List<String> skills3 = Arrays.asList("Java", "CPP", "C");

        List<String> skills4 = Arrays.asList("Java", "CPP", "C", "Python", "GO");

        List<Employee> employees2 = Arrays.asList(new Employee(skills3, "Finance"), new Employee(skills4, "IT"));
        Department department2 = new Department();
        department2.setEmployees(employees2);
        department2.setDepartment("IT");
        List<Department> departments = Arrays.asList(department, department2);
        System.out.println(findEmployeesByDept(departments));

    }

    private static List<String> findUniqueSkillSet(Department department) {
        return department.getEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().collect(Collectors.toList());
    }

    private static Map<String, List<Employee>> findEmployeesByDept(List<Department> departments) {

        return departments.stream().map(Department::getEmployees).flatMap(List::stream).distinct().collect(Collectors.groupingBy(Employee::getDepartment));

    }

}
