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

    /* (1)(1)(a) */
    private double width = 1;
    private double height = 1;

    /* (1)(1)(b) */
    Rectangle() {

    }

    /* (1)(1)(c) */
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    /**
     * @return The area of the rectangle. (1)(1)(d).
     */
    public double getArea() {
        return width * height;
    }

    /**
     * @return The perimeter of the rectangle. (1)(1)(e).
     */
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

}

