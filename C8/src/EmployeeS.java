public class EmployeeS {

    private static int count = 0;
    private String firstName;
    private String lastName;

    public EmployeeS(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
        System.out.printf("EmployeeS constructor: %s %s: count = %d%n", firstName, lastName, count);
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public static int getCount() {

        return count;
    }
}
