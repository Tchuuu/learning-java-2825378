public class StudentProfile {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double gpa;
    String declaredMajor;

    public StudentProfile (String firstName, String lastName, int expectedYearToGraduate, double gpa, String declaredMajor) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate += 1;
    }
}
