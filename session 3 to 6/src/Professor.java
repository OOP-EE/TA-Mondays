public class Professor extends Person {
    private String department;

    public Professor(String firstName, String lastName, String nationalCode, String department) {
        super(firstName, lastName, nationalCode);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void receiveLoan() {
        loanAmount += Person.PROFESSOR_LOAN_AMOUNT;
    }

    @Override
    public String getType() {
        return "Professor";
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
