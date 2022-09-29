package college;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {

    public String courseName;
    public ArrayList<Module> modules;
    public ArrayList<Student> enrolledStudents;

    public DateTime startDate;
    public DateTime endDate;

    public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    // courseName modules enrolledStudents startDate endDate
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CourseProgramme) {
            CourseProgramme comparison = (CourseProgramme)obj;
            return courseName.equals(comparison.getCourseName()) &&
                   startDate.equals(comparison.getStartDate()) &&
                   endDate.equals(comparison.getEndDate());
        }
        return false;
    }

    @Override
    public String toString() {
        String courseString = "";
        courseString += "Course name: " + courseName + "\n";
        courseString += "Associated modules: ";
        for(int i = 0; i < modules.size(); i++) {
            if (i != modules.size()-1)
                courseString += modules.get(i) + ", ";
            else
                courseString += modules.get(i);
        }

        return courseString;
    }
}


















