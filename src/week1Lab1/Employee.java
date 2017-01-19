/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1Lab1;

/**
 *
 * @author Junghwan Yang
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //constructor without args
    public Employee() {
        this("", 0, "", "");
    }
    
    //constructor with two args
     public Employee(String name, int idNumber) {
        this(name, idNumber, "", "");
    }
    
     //constructor with every args
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    //accessor methods
    public String getName() {
        return this.name;
    }
    
    public int getIdNumber() {
        return this.idNumber;
    }
    
    public String getDepartment() {
        return this.department;
    }
    
    public String getPosition() {
        return this.position;
    }
    
    //mutator methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    //method showing every information as text
    public void printAllInformation() {
        System.out.printf("%-20s%-20d%-20s%s%n", this.getName(), this.getIdNumber(), this.getDepartment(), this.getPosition());
    }
}
