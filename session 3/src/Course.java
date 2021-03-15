import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseNum;
    private int courseCredit;
    private int courseGroup;
    private Professor professor;
    private ArrayList<Student> students;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNum=" + courseNum +
                ", courseCredit=" + courseCredit +
                ", courseGroup=" + courseGroup +
                ", professor=" + professor +
                ", students=" + students +
                '}';
    }
}
