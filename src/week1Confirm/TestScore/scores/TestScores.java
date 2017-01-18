/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1Confirm.TestScore.scores;

/**
 *
 * @author Junghwan Yang
 */
public class TestScores {
    //variables holding testscore data
    private int scoreOne, scoreTwo, scoreThree;
    
    public TestScores() {
        
    }
    //constructor
    public TestScores(int scoreOne, int scoreTwo, int scoreThree) {
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
        this.scoreThree = scoreThree;
    }
    
    //accessor methods
    public int getScoreOne() {
        return this.scoreOne;
    }
    public int getScoreTwo() {
        return this.scoreTwo;
    }
    public int getScoreThree() {
        return this.scoreThree;
    }
    
    //mutator methods
    public void setScoreOne(int scoreOne) {
        this.scoreOne = scoreOne;
    }
    public void setScoreTwo(int scoreTwo) {
        this.scoreTwo = scoreTwo;
    }
    public void setScoreThree(int scoreThree) {
        this.scoreThree = scoreThree;
    }
    
    //method can calculate the average of tests
    public double getAverage() {
        return (this.scoreOne + this.scoreTwo + this.scoreThree) / 3;
    }
}
