package com.techelevator;

public class QuizQuestion {
    private String question;
    private String[] answers;
    private String correctAnswer;

    // What color is the sky?|yellow|blue*|green|red
    public QuizQuestion(String line) {
        if(line != null && (!line.isEmpty())){
            String[] separators = line.split("\\|");
            this.question = separators[0];
            this.answers = new String[separators.length-1];
            for(int i = 1; i < separators.length; i++){
                String answer = separators[i].trim();
                if(answer.endsWith("*")){
                    answer = answer.substring(0, answer.length()-1);
                    this.correctAnswer = Integer.toString(i);
                }
                this.answers[i-1] = answer;
            }


        }


    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public boolean isCorrectAnswer(String selectedAnswer) {
        return correctAnswer.equals(selectedAnswer);
    }
}
