/*
 * Assignment 08
 * Description: [Part 1 of 3] Rectangle test class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

public class RectangleTest {
    /**
     * Test cases for the rest of part (1).
     * <p>
     * The {@link Rectangle} class can be found
     * <a href="https://github.com/mosguinz-csc210-03/CSC210Asmt08/blob/main/src/Rectangle.java">here</a>.
     *
     * @see Rectangle
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("[Rectangle 1]");
        printRectangle(r1);
        System.out.println("[Rectangle 2]");
        printRectangle(r2);
    }

    /**
     * Print the information about a rectangle.
     *
     * @param r An instance of {@link Rectangle}.
     */
    public static void printRectangle(Rectangle r) {
        System.out.printf("Width: %.2f%n", r.getWidth());
        System.out.printf("Height: %.2f%n", r.getHeight());
        System.out.printf("Area: %.2f%n", r.getArea());
        System.out.printf("Perimeter: %.2f%n%n", r.getPerimeter());
    }
}
