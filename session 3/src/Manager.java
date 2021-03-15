import java.util.ArrayList;

public class Manager {
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public Manager() {
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        boolean bool = false;
        for (Student student1 : students) {
            if (student1.getStudentId().equals(student.getStudentId())) {
                bool = true;
                break;
            }
        }
        if (!bool) {
            students.add(student);
        }
    }

    public void addProfessor(Professor professor) {
        boolean bool = false;
        for (Professor professor1 : professors) {
            if (professor1.getProfessorId().equals(professor.getProfessorId())) {
                bool = true;
                break;
            }
        }
        if (!bool) {
            professors.add(professor);
        }
    }

    public void addCourse(Course course) {
        // TODO: 3/15/2021
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void showProfessors() {
        for (Professor professor : professors) {
            System.out.println(professor);
        }
    }

    public void showCourse() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
