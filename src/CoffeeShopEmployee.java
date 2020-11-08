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

    /**
     * Uses the {@link Employee} class.
     * <p>
     * The {@link Employee} class can be found
     * <a href="https://github.com/mosguinz-csc210-03/CSC210Asmt08/blob/main/src/Employee.java">here</a>.
     *
     * @see {@link Employee}
     * @see {@link EmployeeTest}
     */
    public static void main(String[] args) {
        /* (3)(1) */
        int amt = promptEmployeeAmount();
        System.out.printf("Creating %d employee(s)...%n%n", amt);

        /* (3)(2) and (3)(3) */
        Employee[] employees = new Employee[amt];
        createEmployees(employees);

        /* (3)(4) */
        System.out.printf("Successfully created %d employee(s).%n", employees.length);
        System.out.println("Below are their profiles for your amusement.\n");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Entry #%d - ", i + 1);
            printProfile(employees[i]);
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

    /**
     * Prompt user for values to create employees. (2)(2) and (2)(3).
     *
     * @param employees An array of {@link Employee} objects.
     */
    private static void createEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("[Employee #%d]%n", i + 1);

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

            System.out.println();

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
     * Print the employee profile. (3)(4).
     * <p>
     * This is the same method used in {@link EmployeeTest}.
     *
     * @param e An instance of {@link Employee}.
     * @see EmployeeTest#printProfile(Employee)
     */
    public static void printProfile(Employee e) {
        System.out.println("[Employee profile]");
        System.out.printf("Name: %s%n", e.getName());
        System.out.printf("Employee ID: %s%n", e.getEmployeeId());
        System.out.printf("Email: %s%n", e.getEmail());
        System.out.printf("Department ID: %s%n%n", e.getDeptId());
    }
}
