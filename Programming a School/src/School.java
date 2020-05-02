import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();

    private String schoolName;
    private String principal;
    private String schoolCity;

    //getters & setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    School() {
        schoolName = "Semiahmoo";
        principal = "Bal Ranu";
        schoolCity = "South Surrey";
    }
    School (String schoolName, String principal, String schoolCity) {
    this.schoolName = schoolName;
    this.principal = principal;
    this.schoolCity = schoolCity;
    }

    //Methods

    public static void deleteTeacher(Teacher) {
    deleteTeacher();
    }

    public static void addTeacher(Teacher) {
    addTeacher();
    }

    public static void deleteStudent(Student) {
    deleteStudent();
    }

    public static void addStudent(Student) {
    addStudent();
    }
}