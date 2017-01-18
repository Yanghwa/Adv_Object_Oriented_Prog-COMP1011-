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
    String name;
    int idNumber;
    String department;
    String position;
    
    //constructor without args
    public Employee() {
        this.name = "";
        this.idNumber = 0; 
        this.department = "";
        this.position = "";
    }
    
    //constructor with two args
     public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber; 
        this.department = "";
        this.position = "";
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
    
    public static void main(String[] args) {
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.printf("%-20s%-20s%-20s%s%n", "Name", "ID Number", "Department", "Position");
        System.out.println("-------------------------------------------------------------------------------");
        susan.printAllInformation();
        mark.printAllInformation();
        joy.printAllInformation();
    }
}
