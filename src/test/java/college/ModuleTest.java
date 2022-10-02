package college;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    Module module;

    // This setup means you don't have to create a new Module Object for each individual test
    @BeforeEach
    void setUp() {
        // Create Student list for Module
        DateTime dateOfBirth1 = new DateTime(2001, 10, 12, 10, 59);
        Student student = new Student("Maurice", 20, dateOfBirth1, 19204719);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        // Create Courses list for Module
        DateTime startDate = new DateTime(2022, 9, 3, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 21, 17, 0);
        CourseProgramme courseProgramme = new CourseProgramme("Computer Science", startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);

        // Create Lecturer for Module
        DateTime dateOfBirth2 = new DateTime(1990, 6, 11, 11, 58);
        Lecturer lecturer = new Lecturer("Seamus", 32, dateOfBirth2, 90213629);

        // Create the Module Object used for the unit testing
        this.module = new Module("Software Engineering");
        this.module.setStudentList(students);
        this.module.setAssociatedCourses(courses);
        this.module.setAssignedLecturer(lecturer);
    }

    @Test
    void getModuleNameTest() {
        assertEquals("Software Engineering", module.getModuleName());
    }

    @Test
    void setModuleNameTest() {
        module.setModuleName("Real Time Systems");
        assertEquals("Real Time Systems", module.getModuleName());
    }

    @Test
    void getStudentListTest() {
        DateTime dateOfBirth1 = new DateTime(2001, 10, 12, 10, 59);
        Student student = new Student("Maurice", 20, dateOfBirth1, 19204719);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        assertEquals(students, module.getStudentList());
    }

    @Test
    void setStudentListTest() {
        DateTime dateOfBirth1 = new DateTime(2000, 10, 12, 10, 59);
        Student student = new Student("Bernadette", 21, dateOfBirth1, 18224749);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        module.setStudentList(students);
        assertEquals(students, module.getStudentList());
    }

    @Test
    void getAssociatedCoursesTest() {
        DateTime startDate = new DateTime(2022, 9, 3, 9, 0);
        DateTime endDate = new DateTime(2023, 5, 21, 17, 0);
        CourseProgramme courseProgramme = new CourseProgramme("Computer Science", startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);
        assertEquals(courses, module.getAssociatedCourses());
    }

    @Test
    void setAssociatedCoursesTest() {
        DateTime startDate = new DateTime(2023, 9, 1, 9, 0);
        DateTime endDate = new DateTime(2024, 5, 15, 12, 0);
        CourseProgramme courseProgramme = new CourseProgramme("Biomedical Engineering", startDate, endDate);
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(courseProgramme);
        module.setAssociatedCourses(courses);
        assertEquals(courses, module.getAssociatedCourses());
    }

    @Test
    void getAssignedLecturerTest() {
        DateTime dateOfBirth = new DateTime(1990, 6, 11, 11, 58);
        Lecturer lecturer = new Lecturer("Seamus", 32, dateOfBirth, 90213629);
        assertEquals(lecturer, module.getAssignedLecturer());
    }

    @Test
    void setAssignedLecturerTest() {
        DateTime dateOfBirth = new DateTime(1985, 7, 4, 10, 38);
        Lecturer lecturer = new Lecturer("Seamus", 37, dateOfBirth, 85213629);
        module.setAssignedLecturer(lecturer);
        assertEquals(lecturer, module.getAssignedLecturer());
    }

    @Test
    void equalsTest() {
        Module testModule = new Module("Software Engineering");
        assertEquals(testModule, this.module);
    }
}