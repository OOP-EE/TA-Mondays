import java.util.ArrayList;
import java.util.Scanner;

public class InputProcessor {
    private Manager manager;
    private Scanner scanner = new Scanner(System.in);

    public InputProcessor(Manager manager) {
        this.manager = manager;
    }

    private void processAddStudent(String[] split) {
        boolean bool = manager.addStudent(new Student(split[2], split[3], split[4], split[5], split[6]));
        if (bool) {
            System.out.println("Add student successful.");
        } else {
            System.err.println("Add student failed! Student has already exist!");
        }
    }

    private void processAddProfessor(String[] split) {
        boolean bool = manager.addProfessor(new Professor(split[2], split[3], split[4], split[5]));
        if (bool) {
            System.out.println("Add professor successful.");
        } else {
            System.err.println("Add professor failed! Student has already exist!");
        }
    }

    private void processAddCourse(String[] split) {
        Professor professor = manager.getProfessorByNationalCode(split[6]);
        if (professor == null) {
            System.err.println("Professor does not exist!");
            return;
        }
        Course course;
        if (split.length == 8) {
            ArrayList<Integer> preCourses = getPreCourses(split[7]);
            course = new Course(split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                    Integer.parseInt(split[5]), professor, preCourses);
        } else {
            course = new Course(split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                    Integer.parseInt(split[5]), professor);
        }

        boolean bool = manager.addCourse(course);
        if (bool) {
            System.out.println("Course successfully added.");
        } else {
            System.err.println("Add course failed! Course has already exist!");
        }
    }

    private ArrayList<Integer> getPreCourses(String preCoursesString) {
        String[] splitPreCourses = preCoursesString.split(",");
        ArrayList<Integer> preCourses = new ArrayList<>();
        for (String splitPreCourse : splitPreCourses) {
            preCourses.add(Integer.parseInt(splitPreCourse));
        }
        return preCourses;
    }

    private void processShowStudents() {
        manager.showStudents();
    }

    private void processShowProfessors() {
        manager.showProfessors();
    }

    private void processShowCourses() {
        manager.showCourses();
    }

    private void processTakeCourse(String[] split) {
        Student student = manager.getStudentByStudentId(split[2]);
        if (student == null) {
            System.err.println("Student does not exist!");
            return;
        }
        Course course = manager.getCourse(Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]));
        if (course == null) {
            System.err.println("Course does not exist!");
            return;
        }
        boolean bool = manager.takeCourseForStudent(course, student);
        if (bool) {
            System.out.println("take course successful.");
        } else {
            System.err.println("take course failed! Student have not passed pre-courses yet!");
        }
    }

    private void processDropCourse(String[] split) {
        Student student = manager.getStudentByStudentId(split[2]);
        if (student == null) {
            System.err.println("Student does not exist!");
            return;
        }
        Course course = manager.getCourse(Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]));
        if (course == null) {
            System.err.println("Course does not exist!");
            return;
        }
        boolean bool = manager.dropCourseForStudent(course, student);
        if (bool) {
            System.out.println("drop course successful.");
        } else {
            System.err.println("drop course failed! Student does not have this course yet!");
        }
    }

    private void processShowCoursesForStudent(String[] spilt) {
        ArrayList<Course> courses = manager.showCoursesForStudent(spilt[4]);
        if (courses == null) {
            System.err.println("Student does not exist!");;
        } else if (courses.isEmpty()) {
            System.out.println("The student doesn't have any course!");
        } else {
            System.out.println("Courses for student with student ID " + spilt[4] + " :");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }

    private void processSubmitCourseMark(String[] split) {
        //TODO
    }

    private void processReceiveLoan(String[] split) {
        Person person = manager.receiveLoanFor(split[3]);
        if (person == null) {
            System.err.println("The national code doesn't exist!");
        } else {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " received load.");
        }
    }

    public void run() {
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            if (input.startsWith("add student")) {
                processAddStudent(input.split("\\s"));
            } else if (input.startsWith("add professor")) {
                processAddProfessor(input.split("\\s"));
            } else if (input.startsWith("add course")) {
                processAddCourse(input.split("\\s"));
            } else if (input.startsWith("take course")) {
                processTakeCourse(input.split("\\s"));
            } else if (input.startsWith("drop course")) {
                processDropCourse(input.split("\\s"));
            } else if (input.startsWith("show courses for student")) {
                processShowCoursesForStudent(input.split("\\s"));
            } else if (input.startsWith("submit course mark")) {
                processSubmitCourseMark(input.split("\\s"));
            } else if (input.startsWith("receive loan")) {
                processReceiveLoan(input.split("\\s"));
            }  else if (input.startsWith("show students")) {
                processShowStudents();
            } else if (input.startsWith("show professors")) {
                processShowProfessors();
            } else if (input.startsWith("show courses")) {
                processShowCourses();
            } else {
                System.err.println("Invalid Input!");
            }

        }
    }
}
