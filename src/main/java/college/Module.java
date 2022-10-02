package college;

import java.util.ArrayList;

public class Module {

    // Required fields for the Module Class
    private String moduleName;
    private ArrayList<Student> studentList;
    private ArrayList<CourseProgramme> associatedCourses;
    private Lecturer assignedLecturer;

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<CourseProgramme> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getAssignedLecturer() {
        return assignedLecturer;
    }

    public void setAssignedLecturer(Lecturer assignedLecturer) {
        this.assignedLecturer = assignedLecturer;
    }

    // Equals method used for comparing Module classes in Unit testing
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Module) {
            Module comparison = (Module)obj;
            return moduleName.equals(comparison.getModuleName());
        }
        return false;
    }

    // toString method used for printing details in the Driver project (part b))
    @Override
    public String toString() {
        StringBuilder moduleString = new StringBuilder("====== MODULE ======\n");
        moduleString.append("\tModule name: ");
        moduleString.append(moduleName).append("\n");
        moduleString.append("\tStudents:");
        for(int i = 0; i < studentList.size(); i++) {
            if (i != studentList.size() - 1)
                moduleString.append("\n\t\t").append(studentList.get(i)).append("\n");
            else
                moduleString.append("\n\t\t").append(studentList.get(i));
        }
        return moduleString.toString();
    }
}
