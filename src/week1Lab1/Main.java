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
public class Main {
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
