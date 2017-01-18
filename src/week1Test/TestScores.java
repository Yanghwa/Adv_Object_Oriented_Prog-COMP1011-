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
public class TestScores {

    private int testScore01;
    private int testScore02;
    private int testScore03;
    private double avg;
    
    TestScores() {
    
    }
    public int getTestScore01() {
        return this.testScore01;
    }
    
    public int getTestScore02() {
        return this.testScore02;
    }
    
    public int getTestScore03() {
        return this.testScore03;
    }
    
     public void setTestScore01(int testScore01) {
        this.testScore01 = testScore01;
    }
    
    public void setTestScore02(int testScore02) {
        this.testScore02 = testScore02;
    }
    
    public void setTestScore03(int testScore03) {
        this.testScore03 = testScore03;
    }
    
    public double averageTestScore() {
        double sum = this.testScore01 + this.testScore02 + this.testScore03;
        this.avg = sum/3;
        return avg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestScores n = new TestScores();
        
        Scanner a = new Scanner(System.in);
        System.out.println("test1's Score?");
        int testScore01 = a.nextInt();
        n.setTestScore01(testScore01);
        System.out.println("test2's Score?");
        int testScore02 = a.nextInt();
        n.setTestScore02(testScore02);
        System.out.println("test3's Score?");
        int testScore03 = a.nextInt();
        n.setTestScore03(testScore03);
        n.averageTestScore();
        System.out.println("Average is:" + n.avg);
    }
    
}
