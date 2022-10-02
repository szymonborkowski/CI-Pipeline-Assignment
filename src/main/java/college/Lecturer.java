package college;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {

    // Required fields for the Lecturer Class
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int ID;
    private String username;
    private ArrayList<Module> modulesTeaching;

    public Lecturer(String name, int age, DateTime dateOfBirth, int ID) {
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

    public ArrayList<Module> getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(ArrayList<Module> modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }

    // Equals method used for comparing Lecturer classes in Unit testing
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Lecturer) {
            Lecturer comparison = (Lecturer) obj;
            return name.equals(comparison.getName()) &&
                    age == comparison.getAge() &&
                    dateOfBirth.equals(comparison.getDateOfBirth()) &&
                    ID == comparison.getID() &&
                    username.equals(comparison.getUsername());
        }
        return false;
    }
}
