public class Professor {
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String department;

    public Professor(String firstName, String lastName, String nationalCode, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.department = department;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
