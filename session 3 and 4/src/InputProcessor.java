import java.util.ArrayList;
import java.util.Scanner;

public class InputProcessor {
    private Manager manager;
    private Scanner scanner = new Scanner(System.in);

    public InputProcessor(Manager manager) {
        this.manager = manager;
    }

    private void processAddStudent(String[] split) {
        boolean bool = manager.addStudent(new Student(split[2], split[3], split[4], split[5]));
        if (bool) {
            System.out.println("Add student successful.");
        } else {
            System.err.println("Add student failed! The student has already exist!");
        }
    }

    private void processAddProfessor(String[] split) {
        boolean bool = manager.addProfessor(new Professor(split[2], split[3], split[4], split[5]));
        if (bool) {
            System.out.println("Add professor successful.");
        } else {
            System.err.println("Add professor failed! The professor has already exist!");
        }
    }

    private void processAddCourse(String[] split) {
        Professor professor = manager.getProfessorByNationalCode(split[6]);
        if (professor == null) {
            System.err.println("The professor does not exist!");
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
            System.out.println("Add course successfully.");
        } else {
            System.err.println("Add course failed! The course has already exist!");
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
        manager.showCourse();
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
            System.err.println("take course failed! The student have not passed pre-courses yet!");
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
            System.err.println("drop course failed! The student does not have this course yet!");
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
            } else if (input.startsWith("show students")) {
                processShowStudents();
            } else if (input.startsWith("show professors")) {
                processShowProfessors();
            } else if (input.startsWith("show courses")) {
                processShowCourses();
            } else if (input.startsWith("take course")) {
                processTakeCourse(input.split("\\s"));
            } else if (input.startsWith("drop course")) {
                processDropCourse(input.split("\\s"));
            } else {
                System.err.println("Invalid Input!");
            }

        }
    }
}
