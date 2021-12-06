package model;

import java.util.Objects;

public class Student {


    private String name;
    private int age;
    protected static final int AVERAGE_PERFORMANCE = 3;
    private int performance;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", performance=" + performance +
                '}';
    }

    public int getPerformance() {
        return this.performance;
    }

    public boolean setName(String newName) {
        if (newName.isBlank()) {
            return false;
        }
        this.name = newName;
        return true;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setPerformance(int newPerformance) {
        this.performance = newPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && performance == student.performance && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, performance);
    }

    public boolean passesTheClass() {
        return this.getPerformance() <= AVERAGE_PERFORMANCE;
    }
}

