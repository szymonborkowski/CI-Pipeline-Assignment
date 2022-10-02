package college;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {

    // Required fields for the Student Class
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int ID;
    private String username;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;

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

    // Equals method used for comparing Student classes in Unit testing
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

    // toString method used for printing details in the Driver project (part b))
    @Override
    public String toString() {
        StringBuilder studentString = new StringBuilder();

        studentString.append("Student name: ").append(name).append("\n");
        studentString.append("\t\tStudent username: ").append(getUsername()).append("\n");
        studentString.append("\t\tAssociated modules: ");
        for(int i = 0; i < modules.size(); i++) {
            if (i != modules.size()-1)
                studentString.append(modules.get(i).getModuleName()).append(", ");
            else
                studentString.append(modules.get(i).getModuleName());
        }
        studentString.append("\n\t\tRegistered Courses: ");
        for(int i = 0; i < courses.size(); i++) {
            if (i != courses.size()-1)
                studentString.append(courses.get(i).getCourseName()).append(", ");
            else
                studentString.append(courses.get(i).getCourseName());
        }
        return studentString.toString();
    }
}
