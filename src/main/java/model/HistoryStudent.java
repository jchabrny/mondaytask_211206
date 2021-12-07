package model;

public class HistoryStudent extends Students {
    public HistoryStudent(int age, String name, double grade, boolean isRepresentative) {
        super(age, "history", name, "library", 3.3, true);

    }

    public void lunch() {
        System.out.println("likes vegetarian dishes in mensa");
    }
}
