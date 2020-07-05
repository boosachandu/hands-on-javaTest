package com.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int id;
    private String deptName;
    private double salary;
}
