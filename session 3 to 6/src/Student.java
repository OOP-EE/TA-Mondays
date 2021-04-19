import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Student extends Person {
    private String studentId;
    private String department;
    private ArrayList<Course> courses;
    // private HashMap<Course, CourseInfo> coursesMap;

    public Student(String firstName, String lastName, String nationalCode, String studentId, String department) {
        super(firstName, lastName, nationalCode);
        this.studentId = studentId;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    @Override
    public void receiveLoan() {
        loanAmount += Person.STUDENT_LOAN_AMOUNT;
    }

    @Override
    public String getType() {
        return "Student";
    }

    public boolean tackCourse(Course newCourse) {
        int counter = newCourse.getPreCourses().size();
        for (Course course : courses) {
            if (newCourse.getPreCourses().contains(course.getCourseNum())) {
                counter--;
            }
        }
        if (counter == 0) {
            courses.add(newCourse);
            return true;
        }
        return false;
    }

    public boolean dropCourse(Course dropCourse) {
        if (courses.contains(dropCourse)) {
            courses.remove(dropCourse);
            return true;
        }
        return false;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
