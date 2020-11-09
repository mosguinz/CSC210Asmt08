/*
 * Assignment 08
 * Description: [Part 2 of 3] Employee test class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

class Employee {

    /* (2)(1)(a) */
    private String employeeId;
    /* (2)(1)(b) */
    private String name;
    /* (2)(1)(c) */
    private String email;
    /* (2)(1)(d) */
    private int deptId;

    /* (2)(1)(e) */
    Employee() {

    }

    /* (2)(1)(f) */
    Employee(String employeeId, String name, String email, int deptId) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.deptId = deptId;
    }


    /*
        Setters and getters for (2)(1)(g)(i) and (2)(1)(g)(ii), respectively.
        Note that there are no validation being performed in the setters.
    */

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}

public class EmployeeTest {
    /**
     * Test cases for the rest of part (2).
     *
     * @see Employee
     */
    public static void main(String[] args) {
        String name = "Mos";
        String id = "921425216";
        String email = "ksitthisarnwattanachai@mail.sfsu.edu";
        int deptId = 210;

        Employee e = new Employee(id, name, email, deptId);
        printProfile(e);

        e.setDeptId(220);
        printProfile(e);
    }

    /**
     * Print the employee profile.
     * <p>
     * This is the same method used in {@link CoffeeShopEmployee}.
     *
     * @param e An instance of {@link Employee}.
     * @see CoffeeShopEmployee#printProfile(Employee)
     */
    public static void printProfile(Employee e) {
        System.out.println("[Employee profile]");
        System.out.printf("Name: %s%n", e.getName());
        System.out.printf("Employee ID: %s%n", e.getEmployeeId());
        System.out.printf("Email: %s%n", e.getEmail());
        System.out.printf("Department ID: %s%n%n", e.getDeptId());
    }
}