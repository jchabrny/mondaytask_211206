import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void nameOfStudentIsRight() {
        String expected = "Thomas";
        Student student = new Student("Thomas");
        student.setName(expected);
        assertEquals(expected, student.getName());
        student.setName("Paul");
        assertEquals("Paul", student.getName());
        boolean result = student.setName("");
        assertNotEquals("", student.getName());
        assertFalse(result);
    }

    @Test
    public void compareStudents() {
        Student student0 = new Student("Julia");
        Student student1 = new Student("Julia");
        student0.setAge(22);
        student1.setAge(23);
        assertEquals(student0, student1);
    }

    @Test
    public void ageOfStudentIsRight() {
        int expected = 22;
        Student student = new Student("Thomas");
        student.setAge(expected);
        assertEquals(expected, student.getAge());
        student.setAge(23);
        assertEquals(23, student.getAge());
        student.setAge(0);
        assertEquals(0, student.getAge());
    }

    @Test
    public void performanceOfStudentIsRight() {
        int expected = 1;
        Student student = new Student("Thomas");
        student.setPerformance(expected);
        assertEquals(expected, student.getPerformance());

        student.setPerformance(4);
        assertEquals(4, student.getPerformance());

        student.setPerformance(0);
        assertEquals(0, student.getPerformance());

    }
}