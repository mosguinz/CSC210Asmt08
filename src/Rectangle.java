/*
 * Assignment 08
 * Description: [Part 1.1 of 3] Rectangle class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

public class Rectangle {

    /* (1)(a) */
    private double width = 1;
    private double height = 1;

    /**
     * Instantiate a {@link Rectangle} object with the default {@link #width}
     * and {@link #height}. (1)(b).
     */
    Rectangle() {

    }

    /**
     * Instantiate a {@link Rectangle} object with the specified {@code width}
     * and {@code height}. (1)(c)
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return The area of the rectangle.
     */
    public double getArea() {
        return width * height;
    }

    /**
     * @return The perimeter of the rectangle.
     */
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

}

