package com.company;

import java.util.Objects;

public class Teacher {
    private int age;
    private String name;
    private String PersonalCode;

    public Teacher(int age, String name, String personalCode) {
        this.age = age;
        this.name = name;
        PersonalCode = personalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalCode() {
        return PersonalCode;
    }

    public void setPersonalCode(String personalCode) {
        PersonalCode = personalCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", personalCode='" + PersonalCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name) && Objects.equals(PersonalCode, teacher.PersonalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, PersonalCode, age);
    }

}
