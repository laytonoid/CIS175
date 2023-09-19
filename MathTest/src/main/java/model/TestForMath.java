package model;

public class TestForMath {
    private int scoring;

    public TestForMath() {
        this.scoring = 0;
    }
    
    public void checkAnswerMulti(int answerIsCorrect, int userAnswer) {
        if (answerIsCorrect == userAnswer) {
            this.scoring++;
        }
    }
    public void checkAnswerAdd(int answerIsCorrect, int userAnswer) {
        if (answerIsCorrect == userAnswer) {
            this.scoring++;
        }
    }


    public int getScore() {
        return scoring;
    }

    public void setScore(int score) {
        this.scoring = score;
    }
}