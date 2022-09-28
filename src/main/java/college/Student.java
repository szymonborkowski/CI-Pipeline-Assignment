package college;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {

    public String name;
    public int age;
    public DateTime dateOfBirth;
    public int ID;
    public String username;
    public ArrayList<CourseProgramme> courses;
    public ArrayList<Module> modules;

    public Student(String name, int age, DateTime dateOfBirth, int ID) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
        this.username = name + age;
    }

    public String getUsername() {
        return name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student comparison = (Student) obj;
            return name.equals(comparison.getName()) &&
                    age == comparison.getAge() &&
                    dateOfBirth.equals(comparison.getDateOfBirth()) &&
                    ID == comparison.getID() &&
                    username.equals(comparison.getUsername());
        }
        return false;
    }
}
