/*
 * Assignment 08
 * Description: [Part 2 of 3] Employee test class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

public class EmployeeTest {
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
     *
     * @param e An instance of {@link Employee}.
     */
    public static void printProfile(Employee e) {
        System.out.println("[Employee profile]");
        System.out.printf("Name: %s%n", e.getName());
        System.out.printf("Employee ID: %s%n", e.getEmployeeId());
        System.out.printf("Email: %s%n", e.getEmail());
        System.out.printf("Department ID: %s%n%n", e.getDeptId());
    }
}
