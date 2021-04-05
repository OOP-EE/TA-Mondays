import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseNum;
    private int courseCredit;
    private int courseGroup;
    private Professor professor;
    private ArrayList<Integer> preCourses;

    public Course(String courseName, int courseNum, int courseCredit, int courseGroup,
                  Professor professor) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.courseCredit = courseCredit;
        this.courseGroup = courseGroup;
        this.professor = professor;
        this.preCourses = new ArrayList<>();
    }

    public Course(String courseName, int courseNum, int courseCredit, int courseGroup,
                  Professor professor, ArrayList<Integer> preCourses) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.courseCredit = courseCredit;
        this.courseGroup = courseGroup;
        this.professor = professor;
        this.preCourses = preCourses;
    }

    public ArrayList<Integer> getPreCourses() {
        return preCourses;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public int getCourseGroup() {
        return courseGroup;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNum=" + courseNum +
                ", courseCredit=" + courseCredit +
                ", courseGroup=" + courseGroup +
                ", professor=" + professor +
                ", preCourses=" + preCourses +
                '}';
    }
}
