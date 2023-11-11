package quizzApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		
		String name=sc.next();
		Student profile=new Student();
		profile.setName(name);
		
	
		QuizService service=new QuizService();
		service.playQuiz();
		profile.setScore(service.score);
		System.out.println(" Hola!! "+profile.getName()+"  you  got score "+profile.getScore());
		
		
		
	}

}
