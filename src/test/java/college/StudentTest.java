package college;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    // This setup means you don't have to create a new Student Object for each individual test
    @BeforeEach
    void setUp() {
        // Create course
        // String courseName, DateTime startDate, DateTime endDate
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 18, 12, 30);
        CourseProgramme courseProgramme = new CourseProgramme("Electronic and Computer Engineering",
                                                              startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);

        // Create Module for testing Student
        Module module = new Module("Embedded Systems");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        DateTime dateOfBirth = new DateTime(2001, 9, 11, 10, 59);
        this.student = new Student("Joe", 21, dateOfBirth, 19307527);
        this.student.setCourses(courses);
        this.student.setModules(modules);
    }

    @Test
    void getUsername() {
        assertEquals("Joe21", student.getUsername());
    }

    @Test
    void getName() {
        assertEquals("Joe", student.getName());
    }

    @Test
    void setName() {
        student.setName("Napoleon");
        assertEquals("Napoleon", student.getName());
    }

    @Test
    void getAge() {
        assertEquals(21, student.getAge());
    }

    @Test
    void setAge() {
        student.setAge(30);
        assertEquals(30, student.getAge());
    }

    @Test
    void getDateOfBirth() {
        DateTime dateOfBirth = new DateTime(2001, 9, 11, 10, 59);
        assertEquals(dateOfBirth, student.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        DateTime dateOfBirth = new DateTime(2000, 1, 2, 5, 31);
        student.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, student.getDateOfBirth());
    }

    @Test
    void getID() {
        assertEquals(19307527, student.getID());
    }

    @Test
    void setID() {
        student.setID(19032921);
        assertEquals(19032921, student.getID());
    }

    @Test
    void getCourses() {
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 18, 12, 30);
        CourseProgramme courseProgramme = new CourseProgramme("Electronic and Computer Engineering",
                startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);
        assertEquals(courses, student.getCourses());
    }

    @Test
    void setCourses() {
        DateTime startDate = new DateTime(2023, 10, 6, 9, 0);
        DateTime endDate = new DateTime(2024, 6, 15, 12, 30);
        CourseProgramme courseProgramme = new CourseProgramme("Mechanical Engineering",
                startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);
        student.setCourses(courses);
        assertEquals(courses, student.getCourses());
    }

    @Test
    void getModules() {
        Module module = new Module("Embedded Systems");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        assertEquals(modules, student.getModules());
    }

    @Test
    void setModules() {
        Module module = new Module("Mobile Networks");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        student.setModules(modules);
        assertEquals(modules, student.getModules());
    }

    @Test
    void equalsTest() {
        DateTime dateOfBirth = new DateTime(2001, 9, 11, 10, 59);
        Student testStudent = new Student("Joe", 21, dateOfBirth, 19307527);
        assertEquals(testStudent, this.student);
    }
}