/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1Confirm.TestScore.general;
import week1Confirm.TestScore.scores.TestScores;
import java.util.Scanner;
/**
 *
 * @author Junghwan Yang
 */
public class TestClass {
    public static void main(String[] args) {
        int scoreOne, scoreTwo, scoreThree;
        
        System.out.println("Please enter the first score: ");
        scoreOne = new Scanner(System.in).nextInt();
        System.out.println("Please enter the second score: ");
        scoreTwo = new Scanner(System.in).nextInt();
        System.out.println("Please enter the third score: ");
        scoreThree = new Scanner(System.in).nextInt();
        
        TestScores scores = new TestScores(scoreOne, scoreTwo, scoreThree);
        
        System.out.println("Average score : " + scores.getAverage());
    }
}
