package college;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest {

    CourseProgramme courseProgramme;
    Module module;
    Student student;

    // This setup means you don't have to create a new CourseProgramme Object for each individual test
    @BeforeEach
    void setUp() {
        // Create a Module for the CourseProgramme
        this.module = new Module("Software Engineering");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        // Create a Student for the CourseProgramme
        DateTime dateOfBirth = new DateTime(2000, 1, 21, 10, 54);
        this.student = new Student("Montgomery", 22, dateOfBirth, 18240092);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        // Create the CourseProgramme Object which is then used for each test
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 20, 17, 0);
        this.courseProgramme = new CourseProgramme("Computer Science", startDate, endDate);
        this.courseProgramme.setModules(modules);
        this.courseProgramme.setEnrolledStudents(students);
    }

    @Test
    void getCourseNameTest() {
        assertEquals("Computer Science", courseProgramme.getCourseName());
    }

    @Test
    void setCourseNameTest() {
        courseProgramme.setCourseName("Electronic and Computer Engineering");
        assertEquals("Electronic and Computer Engineering", courseProgramme.getCourseName());
    }

    @Test
    void getModulesTest() {
        Module testModule = new Module("Software Engineering");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(testModule);
        assertEquals(modules, courseProgramme.getModules());
    }

    @Test
    void setModulesTest() {
        Module testModule = new Module("Real Time Systems");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(testModule);
        courseProgramme.setModules(modules);
        assertEquals(modules, courseProgramme.getModules());
    }

    @Test
    void getEnrolledStudentsTest() {
        DateTime dateOfBirth = new DateTime(2000, 1, 21, 10, 54);
        Student testStudent = new Student("Montgomery", 22, dateOfBirth, 18240092);
        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudent);
        assertEquals(students, courseProgramme.getEnrolledStudents());
    }

    @Test
    void setEnrolledStudentsTest() {
        DateTime dateOfBirth = new DateTime(2001, 2, 22, 20, 45);
        Student testStudent = new Student("Joseph", 22, dateOfBirth, 19041023);
        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudent);
        courseProgramme.setEnrolledStudents(students);
        assertEquals(students, courseProgramme.getEnrolledStudents());
    }

    @Test
    void getStartDateTest() {
        DateTime testStartDate = new DateTime(2022, 9, 1, 9, 0);
        assertEquals(testStartDate, courseProgramme.getStartDate());
    }

    @Test
    void setStartDate() {
        DateTime testNewStartDate = new DateTime(2022, 10, 5, 9, 0);
        courseProgramme.setStartDate(testNewStartDate);
        assertEquals(testNewStartDate, courseProgramme.getStartDate());
    }

    @Test
    void getEndDateTest() {
        DateTime testEndDate = new DateTime(2023, 5, 20, 17, 0);
        assertEquals(testEndDate, courseProgramme.getEndDate());
    }

    @Test
    void setEndDateTest() {
        DateTime testNewEndDate = new DateTime(2023, 6, 22, 13, 0);
        courseProgramme.setEndDate(testNewEndDate);
        assertEquals(testNewEndDate, courseProgramme.getEndDate());
    }

    @Test
    void equalsTest() {
        // Create the CourseProgramme Object which is then used for each test
        DateTime startDate = new DateTime(2022, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 20, 17, 0);
        CourseProgramme testCourseProgramme = new CourseProgramme("Computer Science", startDate, endDate);
        assertEquals(testCourseProgramme, this.courseProgramme);
    }
}