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

    public boolean addStudent(Student student) {
        boolean bool = true;
        for (Student student1 : students) {
            if (student1.getStudentId().equals(student.getStudentId())) {
                bool = false;
                break;
            }
        }
        if (bool) {
            students.add(student);
        }
        return bool;
    }

    public boolean addProfessor(Professor professor) {
        boolean bool = true;
        for (Professor professor1 : professors) {
            if (professor1.getNationalCode().equals(professor.getNationalCode())) {
                bool = false;
                break;
            }
        }
        if (bool) {
            professors.add(professor);
        }
        return bool;
    }

    public boolean addCourse(Course newCourse) {
        for (Course course : courses) {
            if (course.getCourseNum() == newCourse.getCourseNum()) {
                if (course.getCourseName().equals(newCourse.getCourseName())) {
                    if (course.getCourseCredit() == newCourse.getCourseCredit() &&
                            course.getCourseGroup() == newCourse.getCourseGroup()) {
                        return false;
                    }

                } else {
                    return false;
                }
            }
        }
        courses.add(newCourse);
        return true;
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

    public boolean takeCourseForStudent(Course course, Student student) {
        return student.tackCourse(course);
    }

    public boolean dropCourseForStudent(Course course, Student student) {
        return student.dropCourse(course);
    }

    public Professor getProfessorByNationalCode(String nationalCode) {
        for (Professor professor : professors) {
            if (professor.getNationalCode().equals(nationalCode)) {
                return professor;
            }
        }
        return null;
    }

    public Student getStudentByStudentId(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Course getCourse(int courseNum, int courseCredit, int courseGroup) {
        for (Course course : courses) {
            if(course.getCourseNum() == courseNum &&
                    course.getCourseCredit() == courseCredit &&
                    course.getCourseGroup() == courseGroup) {
                return course;
            }
        }
        return null;
    }
}
