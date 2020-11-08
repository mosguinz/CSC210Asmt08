/*
 * Assignment 08
 * Description: [Part 3 of 3] Coffee shop employee class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

import java.util.Scanner;

public class CoffeeShopEmployee {

    public static final int MIN_EMPLOYEE = 3;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int amt = promptEmployeeAmount();

        Employee[] employees = new Employee[amt];

        /* (3)(2) and (3)(3) */
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%n[Employee #%d]%n", i + 1);

            /* This could've been nicer, but oh well... */
            System.out.print("Enter the name: ");
            String name = scan.nextLine();
            System.out.print("Enter the email: ");
            String email = scan.nextLine();
            System.out.print("Enter the employee ID: ");
            String employeeID = scan.nextLine();
            System.out.print("Enter the department ID: ");
            int departmentID = scan.nextInt();
            scan.nextLine();

            /*
                We could just use the constructor but (3)(3)
                requires the use of setters.

                Here, the objects are instantiated and assigned values
                separately in order to satisfy (3)(2) and (3)(3), respectively.
            */
            Employee e = employees[i] = new Employee();
            e.setName(name);
            e.setEmail(email);
            e.setEmployeeId(employeeID);
            e.setDeptId(departmentID);
        }
    }

    /**
     * Prompt and validate the amount of {@link Employee} objects to
     * instantiate. The minimum (inclusive) amount is set by {@link
     * #MIN_EMPLOYEE} (3 by default). Satisfies (3)(1).
     *
     * @return The valid number of employee to create.
     */
    private static int promptEmployeeAmount() {
        while (true) {
            System.out.print("Enter the number of employees you want to create: ");
            int amt = scan.nextInt();
            if (amt < MIN_EMPLOYEE) {
                System.out.printf("Invalid amount. Must be at least %d.%n", MIN_EMPLOYEE);
                continue;
            }
            scan.nextLine();
            return amt;
        }
    }
}
