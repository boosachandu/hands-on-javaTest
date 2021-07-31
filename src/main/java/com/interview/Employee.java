package com.interview;

import java.util.List;

public class Employee {

    List<String> skills;

    public Employee() {
    }

    public Employee(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
