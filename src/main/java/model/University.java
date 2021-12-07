package model;

public class University {

    String universityName;
    IStudent[] studentList;
    boolean studentRepresentative;

    public University(String universityName, IStudent[] studentList, boolean studentRepresentative) {
        this.universityName = universityName;
        this.studentList = studentList;
        this.studentRepresentative = studentRepresentative;
    }

    public IStudent[] getStudentList() {
        return studentList;
    }

    public int getStudentCount() {
        int countStudents = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                countStudents = countStudents + 1;
            }
        }
        System.out.println(countStudents);
        return countStudents;
    }


    /*list Students gibt alle Studenten zurück
    getStudentCount gibt Anzahl der Studenten zurück
    addStudent um einen Student einzuschreiben
    removeStudent um einen Studenten zu entfernen
    getBestStudent gibt Studenten mit bester Note zurück
    getAverageGrade git Durchschnitts-Note aller Studenten zurück
    setStudentRepresentative um den Studenten Vertreter zu setzen

     */
}
