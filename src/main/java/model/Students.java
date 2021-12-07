package model;

public class Students implements IStudent {
    public String getSpecificStudent() {
        return "Unknown student";
    }

    private int age;
    private String subject;
    private String name;
    private String place;
    private double grade;
    private boolean isRepresentative;

    public Students(int age, String subject, String name, String place, double grade, boolean isRepresentative) {
        this.age = age;
        this.subject = subject;
        this.name = name;
        this.place = place;
        this.grade = grade;
        this.isRepresentative = isRepresentative;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getPlace() {
        return place;
    }

    public void lunch() {
        System.out.println("goes to mensa");
    }
}
