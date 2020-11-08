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
        promptEmployeeAmount();
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
            return amt;
        }
    }
}
