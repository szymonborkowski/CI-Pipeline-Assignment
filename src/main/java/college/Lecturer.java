package college;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {

    public String name;
    public int age;
    public DateTime dateOfBirth;
    public int ID;
    public String username;
    public ArrayList<Module> modulesTeaching;

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

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", ID=" + ID +
                ", username='" + username + '\'' +
                ", modulesTeaching=" + modulesTeaching +
                '}';
    }
}
