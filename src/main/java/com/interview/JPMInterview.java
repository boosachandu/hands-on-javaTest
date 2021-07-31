package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JPMInterview {

    public static void main(String[] args) {
        List<String> skills1 = Arrays.asList("Java", "CPP", "C");

        List<String> skills2 = Arrays.asList("Java", "CPP", "C", "Python", "GO");

        List<Employee> employees = Arrays.asList(new Employee(skills1), new Employee(skills2));

        Department department = new Department();
        department.setEmployees(employees);
        System.out.println(findUniqueSkillSet(department));

    }

    private static List<String> findUniqueSkillSet(Department department){
        return department.getEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().collect(Collectors.toList());
    }
}
