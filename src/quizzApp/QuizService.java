package quizzApp;

import java.util.Scanner;

public class QuizService {
//Question question1=new Question(1,"sizeofint","2","6","4","8","4");
//Question question2=new Question();
//Question question3=new Question();
//Question question4=new Question();
//Question question5=new Question();
	int nums[]=new int[5];//array of 5 integers
	Question questions[]=new Question[5];//array of references
	int optionsret=0;
	int score =0;
	Scanner sc=null;
	
	public QuizService() {
		
			questions[0]=new Question(1,"sizeofint","2","6","4","8","4");
			questions[1]=new Question(2,"Which data type is used to create a variable that should store text?","int","float","String","long","String");
		questions[2]=new Question(3,"Which method can be used to find the length of a string?","getSize","len()","getLength()","Length()","Length()");
		questions[3]=new Question(4,"Which operator can be used to compare two values?","=","<>","==",">>","==");
		questions[4]=new Question(5,"To declare an array in Java, define the variable type with:","{}","[]","()","||","[]");
	}
 
	public void playQuiz()  {
		String chooseOption = null;
		int userAnswer=0;
		
	
		

		for(Question q:questions) {
			
		
			System.out.println(q.getTitle());
			System.out.println("option 1:"+q.getOption1()+"  option 2 :"+q.getOption2()+"  option 3 :"+q.getOption3()+" option 4 :"+q.getOption4());
			
	
				 sc=new Scanner(System.in);
			    userAnswer=sc.nextInt();
			     
			
		  switch (userAnswer) {
		  case 1->chooseOption=q.getOption1();
		  case 2->chooseOption=q.getOption2();
		  case 3->chooseOption=q.getOption3();
		  case 4->chooseOption=q.getOption4();
		
		  }
		  if(userAnswer>0&&userAnswer<5) {
		    	
			  System.out.println("u choosed  "+chooseOption);
			
		  }else {
			System.out.println("invalid input");
		  }
		
		
		 

			 if(chooseOption.equals(q.getAnswer())){
				
                System.out.println("correct answer");
                score+=2;
			} else {
                	System.out.println("wrong answer");
                	score--;
                	
			}
	     
            }
		  
		
               
			}
	
}
	
			
			
		
		
		
		
		
		
	


