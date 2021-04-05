import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private String department;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String studentId, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.department = department;
        this.courses = new ArrayList<>();
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
