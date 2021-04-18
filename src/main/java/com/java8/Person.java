package com.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private int personId;
    private String name;
    private Date birthDate;
    private Gender gender;
}
