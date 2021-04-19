public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String nationalCode;
    protected long loanAmount;
    public static final long STUDENT_LOAN_AMOUNT = 5_000_000;
    public static final long PROFESSOR_LOAN_AMOUNT = 10_000_000;

    public Person(String firstName, String lastName, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.loanAmount = 0;
    }

    public abstract void receiveLoan();

    public abstract String getType();

    public void eat() {
        System.out.println("eating");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public long getLoanAmount() {
        return loanAmount;
    }
}
