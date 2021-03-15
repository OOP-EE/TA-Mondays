import java.util.Scanner;

public class InputProcessor {
    private Manager manager;
    private Scanner scanner = new Scanner(System.in);

    public InputProcessor(Manager manager) {
        this.manager = manager;
    }

    private void processAddStudent(String[] split) {
        manager.addStudent(new Student(split[2], split[3], split[4], split[5]));
    }

    private void processAddProfessor(String[] split) {
        manager.addProfessor(new Professor(split[2], split[3], split[4], split[5]));
    }

    private void processAddCourse(String[] split) {
        // TODO: 3/15/2021
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
            } else if (input.startsWith("show all courses")) {
                processShowCourses();
            } else {
                System.err.println("Invalid Input!");
            }

        }
    }
}
