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
     * Test cases for the rest of part two.
     * <p>
     * The {@link Rectangle} class can be found
     * <a href="https://github.com/mosguinz-csc210-03/CSC210Asmt08/blob/main/src/Rectangle.java">here</a>.
     *
     * @see {@link Rectangle}
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        Rectangle[] rectangles = {r1, r2};

        for (int i = 0; i < rectangles.length; i++) {
            Rectangle r = rectangles[i];
            System.out.printf("[Rectangle %d]%n", i + 1);
            System.out.printf("Width: %.2f%n", r.getWidth());
            System.out.printf("Height: %.2f%n", r.getHeight());
            System.out.printf("Area: %.2f%n", r.getArea());
            System.out.printf("Perimeter: %.2f%n%n", r.getPerimeter());
        }
    }
}
