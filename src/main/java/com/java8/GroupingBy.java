package com.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
    private static final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public static void main(String[] args) {

        List<String> items = Arrays.asList("Apple", "Mango", "Apple", "Orange", "Banana", "Apple", "Mango", "Banana");
        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        //--------------------------
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        List<String> productNames = productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println(productNames);

        //-----------------------------Group by product price

        Map<Double, List<Product>> productListByPrice = productList.stream()
                .collect(Collectors.groupingBy(Product::getPrice));
        System.out.println(productListByPrice);

        //-----------Group by product name
        Map<String, List<Product>> productListByName = productList.stream()
                .collect(Collectors.groupingBy(Product::getName));
        System.out.println(productListByName);

        //--------------- with Person pojo--------------

        try {

            List<Person> persons = new ArrayList<>();
            persons.add(new Person(1, "Yashwant", dateFormat.parse("11/02/1982"), Gender.MALE));
            persons.add(new Person(2, "Mahesh", dateFormat.parse("01/08/1981"), Gender.MALE));
            persons.add(new Person(3, "Vinay", dateFormat.parse("01/08/1981"), Gender.MALE));
            persons.add(new Person(4, "Dinesh", dateFormat.parse("01/08/1981"), Gender.MALE));
            persons.add(new Person(5, "Kapil", dateFormat.parse("01/02/1989"), Gender.MALE));
            persons.add(new Person(6, "Ganesh", dateFormat.parse("11/02/1982"), Gender.MALE));
            persons.add(new Person(7, "Nita", dateFormat.parse("01/08/1981"), Gender.FEMALE));
            persons.add(new Person(8, "Pallavi", dateFormat.parse("04/25/1987"), Gender.FEMALE));
            persons.add(new Person(9, "Mayuri", dateFormat.parse("01/08/1981"), Gender.FEMALE));
            persons.add(new Person(10, "Divya", dateFormat.parse("01/08/1981"), Gender.FEMALE));

            Map<Gender, Long> byGender = persons.stream()
                    .collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));

            Map<Object, Long> byBirthDate = persons.stream()
                    .collect(Collectors.groupingBy(p -> dateFormat.format(p.getBirthDate()), Collectors.counting()));

            Map<Gender, Map<Object, String>> byGenderAndBirthDate = persons.stream()
                    .collect(Collectors.groupingBy(Person::getGender,
                            Collectors.groupingBy(p -> dateFormat.format(p.getBirthDate()),
                                    Collectors.mapping(Person::getName, Collectors.joining(", ")))));

            Map<Gender, Map<Object, List<Person>>> personsByGenderAndBirthDate = persons.stream()
                    .collect(Collectors.groupingBy(Person::getGender,
                            Collectors.groupingBy(p-> dateFormat.format(p.getBirthDate()))));

            System.out.println("Group By Gender");
            System.out.println(byGender);
            System.out.println("\nGroup By BirthDate");
            System.out.println(byBirthDate);
            System.out.println("\nGroup By Gender & BirthDate");
            System.out.println(byGenderAndBirthDate);
            System.out.println("\nPersons Group By Gender & BirthDate");
            System.out.println(personsByGenderAndBirthDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
