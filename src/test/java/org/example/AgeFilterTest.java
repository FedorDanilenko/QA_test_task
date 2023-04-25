package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.AgeFilter.is18;
import static org.junit.jupiter.api.Assertions.*;

class AgeFilterTest {

    private List<Person> persons = new ArrayList<>();

    @BeforeEach
    void clearList() {
        persons.clear();
    }

    @Test
    void testCreatePerson() {
        Person person = new Person("Person", 20);
        assertEquals("Person", person.getName());
        assertEquals(20, person.getAge());
    }

    @Test
    void testCreatePersonWithNullArg() {
        assertThrows(IllegalArgumentException.class, () -> new Person(null, 20));
    }

    @Test
    void testCreatePersonWith0Age() {
        assertThrows(IllegalArgumentException.class, () -> new Person("John", 0));
    }

    @Test
    void filterAgeTest() {
        persons.add(new Person("Jake" , 32));
        persons.add(new Person("Finn", 17));
        persons.add(new Person("Ice King", 1043));
        persons.add(new Person("Flame Princess", 16));
        persons.add(new Person("Marceline", 1000));

        List<String> expectedNames = List.of(new String[]{"Jake", "Ice King", "Marceline"});

        assertEquals(expectedNames, is18(persons));
    }
}