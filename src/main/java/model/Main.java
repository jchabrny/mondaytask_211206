package model;

public class Main {


    public static void main(String[] args) {
        int age = 22;
        String subject = "history";
        String name = "Kai";
        String place = "library";
        double grade = 1.7;
        boolean isRepresentative = true;
        IStudent[] studentList = generateStudentList();

        Students myStudents = new Students(age, subject, name, place, grade, true);
        Students myHistoryStudent = new HistoryStudent(28, "Julia", 2.3, false);
        Students myComputerScienceStudent = new ComputerScienceStudent(28, "Julia", 2.5, false);
        myStudents.lunch();
        myHistoryStudent.lunch();
        myComputerScienceStudent.lunch();


        System.out.println(getStudents(studentList));

        University myUniversity = new University("Coding Institute", studentList, true);
        myUniversity.getStudentCount();
    }

    private static String getStudents(IStudent[] studentList) {
        String result = "";
        for (IStudent student : studentList) {
            result = result + ", " + student.getSubject();
        }
        return result;
    }

    public static IStudent[] generateStudentList() {
        IStudent[] studentList = new IStudent[3];
        studentList[0] = new HistoryStudent(22, "Johannes", 3.4, false);
        studentList[1] = new HistoryStudent(28, "Ferdinand", 4.1, false);
        studentList[2] = new ComputerScienceStudent(32, "Martina", 3.7, true);
        return studentList;
    }
}
