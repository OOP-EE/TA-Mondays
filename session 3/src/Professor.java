public class Professor {
    private String firstName;
    private String lastName;
    private String professorId;
    private String department;

    public Professor(String firstName, String lastName, String professorId, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.professorId = professorId;
        this.department = department;
    }

    public String getProfessorId() {
        return professorId;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", professorId='" + professorId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
