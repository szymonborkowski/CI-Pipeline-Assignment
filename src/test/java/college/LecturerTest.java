package college;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    Lecturer lecturer;
    Module module;

    @BeforeEach
    void setUp() {
        // Create a Module for the Lecturer
        this.module = new Module("Software Engineering");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        // Create the Lecturer Object which is then used for each test
        DateTime dateOfBirth = new DateTime(1969, 7, 16, 20, 31);
        this.lecturer = new Lecturer("Buzz", 53, dateOfBirth, 69731038);
        this.lecturer.setModulesTeaching(modules);
    }

    @Test
    void getUsernameTest() {
        assertEquals("Buzz53", lecturer.getUsername());
    }

    @Test
    void getNameTest() {
        assertEquals("Buzz", lecturer.getName());
    }

    @Test
    void setNameTest() {
        lecturer.setName("Hubert");
        assertEquals("Hubert", lecturer.getName());
    }

    @Test
    void getAgeTest() {
        assertEquals(53, lecturer.getAge());
    }

    @Test
    void setAgeTest() {
        lecturer.setAge(54);
        assertEquals(54, lecturer.getAge());
    }

    @Test
    void getDateOfBirthTest() {
        DateTime dateOfBirth = new DateTime(1969, 7, 16, 20, 31);
        assertEquals(dateOfBirth, lecturer.getDateOfBirth());
    }

    @Test
    void setDateOfBirthTest() {
        DateTime newDateOfBirth = new DateTime(1966, 6, 15, 21, 11);
        lecturer.setDateOfBirth(newDateOfBirth);
        assertEquals(newDateOfBirth, lecturer.getDateOfBirth());
    }

    @Test
    void getIDTest() {
        assertEquals(69731038, lecturer.getID());
    }

    @Test
    void setIDTest() {
        lecturer.setID(66232368);
        assertEquals(66232368, lecturer.getID());
    }

    @Test
    void getModulesTeachingTest() {
        this.module = new Module("Software Engineering");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        assertEquals(modules, lecturer.getModulesTeaching());
    }

    @Test
    void setModulesTeachingTest() {
        this.module = new Module("Real Time Systems");
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);
        lecturer.setModulesTeaching(modules);
        assertEquals(modules, lecturer.getModulesTeaching());
    }

}



























