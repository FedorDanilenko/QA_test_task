package org.example;

import java.util.List;

public class AgeFilter {

    public static List<String> is18(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getName)
                .toList();
    }
}
