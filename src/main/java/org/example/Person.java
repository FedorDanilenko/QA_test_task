package org.example;

import org.jetbrains.annotations.NotNull;

public class Person {

    private String name;
    private int age;

    public Person(@NotNull String name, int age) {
        this.name = name;
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
