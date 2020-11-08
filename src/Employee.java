/*
 * Assignment 08
 * Description: [Part 2.1 of 3] Employee class
 * Name: Kullathon "Mos" Sitthisarnwattanachai
 * Teammate: Amber Hartigan
 * ID: 921425216
 * Class: CSC 210-03
 * Semester: Fall 2020
 */

public class Employee {

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


    /* Setters and getters for (2)(1)(g)(i) and (2)(1)(g)(ii), respectively. */

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
