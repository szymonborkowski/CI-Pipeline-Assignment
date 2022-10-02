package college;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    // Required fields for the CourseProgramme Class
    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> enrolledStudents;
    private DateTime startDate;
    private DateTime endDate;

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

    // Equals method used for comparing CourseProgramme classes in Unit testing
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

    // toString method used for printing details in the Driver project (part b))
    @Override
    public String toString() {
        StringBuilder courseString = new StringBuilder("\n====== COURSE ======\n");
        courseString.append("Course name: ").append(courseName).append("\n");
        courseString.append("Associated modules: \n");
        for(int i = 0; i < modules.size(); i++) {
            if (i != modules.size()-1)
                courseString.append("\t").append(modules.get(i)).append("\n");
            else
                courseString.append("\t").append(modules.get(i));
        }

        return courseString.toString();
    }
}


















