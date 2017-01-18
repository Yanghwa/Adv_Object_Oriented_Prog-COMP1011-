/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1Test;

import java.util.Scanner;

/**
 *
 * @author Junghwan Yang
 */
public class MonthDays {
    private int month;
    private int year;
    private boolean leapYear;
    private boolean bigMonth;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
        checkMonth();
        checkYear();
    }
    
    public void checkMonth() {
        if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
            this.bigMonth = true;
        } else {
            this.bigMonth = false;
        }
    }
    
    public void checkYear() {
        if(this.year%100 == 0) {
            if(this.year%400 == 0) {
                this.leapYear = true;
            } else {
                this.leapYear = false;
            }
        } else {
            if(this.year%4 == 0) {
                this.leapYear = true;
            } else {
                this.leapYear = false;
            }
        }
    }
    
    
    public void getNumberOfDays() {
        if(this.bigMonth) {
            System.out.println("31 Days");
        } else if(this.month == 2){
            if(this.leapYear) {
                System.out.println("29 Days");
            } else {
                System.out.println("28 Days");
            }
        } else {
            System.out.println("30 Days");
        }
    }
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a month (1 - 12) : ");
        int month = a.nextInt();
        System.out.println("Enter a year : ");
        int year = a.nextInt();
        MonthDays m = new MonthDays(month, year);
        m.getNumberOfDays();
    }
}
