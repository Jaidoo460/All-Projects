package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	private static final String FILE_PATH = "./test_quiz.txt";

	public static void main(String[] args) throws FileNotFoundException {

		File testFile = new File(FILE_PATH);
		Scanner userInput = new Scanner(System.in);
		Scanner testScanner = new Scanner(testFile);
		List<QuizQuestion> quizQuestions = new ArrayList<>();
		try(Scanner fileScanner = new Scanner(testFile)){
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				quizQuestions.add(new QuizQuestion(line));
			}
		}
		int numberOfQuestion = 0;
		int numberOfCorrectAnswer = 0;
		for(QuizQuestion quizQuestion : quizQuestions){
			while(true){
				System.out.println("\n" + quizQuestion.getQuestion());
				for(int i = 0; i < quizQuestion.getAnswers().length; i++){
					System.out.println((i + 1) + "." + quizQuestion.getAnswers()[i]);
				}
				System.out.println("\nwhat is your answer?");
				String userAnswer = userInput.nextLine();
				if(!userAnswer.isEmpty() && userAnswer.matches("[1-4]")){
					if(quizQuestion.isCorrectAnswer(userAnswer)){
						System.out.println("correct");
						numberOfCorrectAnswer += 1;

					}else {
						System.out.println("Sorry wrong answer ");

					}
					break;
				}
				System.out.println("Invalid answer");
			}
			numberOfQuestion += 1;
		}
		System.out.println("You got " + numberOfCorrectAnswer + " answer(s) correct out of the " + numberOfQuestion + " questions asked" );
	}

}
