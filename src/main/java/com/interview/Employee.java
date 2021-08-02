package com.interview;

import com.google.common.base.Objects;

import java.util.List;

public class Employee {

    List<String> skills;

    String department;

    public Employee() {
    }

    public Employee(List<String> skills, String department) {
        this.skills = skills;
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "skills=" + skills +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equal(skills, employee.skills) && Objects.equal(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(skills, department);
    }
}
