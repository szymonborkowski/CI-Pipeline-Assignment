package college;

import java.util.ArrayList;

public class Module {

    public String moduleName;
    public ArrayList<Student> studentList;
    public ArrayList<CourseProgramme> associatedCourses;
    public Lecturer assignedLecturer;

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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Module) {
            Module comparison = (Module)obj;
            return moduleName.equals(comparison.getModuleName());
        }
        return false;
    }
}
