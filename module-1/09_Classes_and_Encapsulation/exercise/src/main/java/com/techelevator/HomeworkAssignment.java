package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPercent() {
        return (this.earnedMarks / this.possibleMarks) * 100;
    }

    public String getLetterGrade() {
        double percent = (((double) this.earnedMarks / (double) this.possibleMarks) * 100);
        if (percent >= 90){
            this.letterGrade = "A";

        } else if (percent >= 80){
            this.letterGrade = "B";

        } else if (percent >= 70){
        this.letterGrade = "C";

        } else if (percent >= 60){
        this.letterGrade = "D";

        } else {
        this.letterGrade = "F";

        } return this.letterGrade;
    }


    public int getEarnedMarks() {
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public String getSubmitterName() {
        return this.submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}


