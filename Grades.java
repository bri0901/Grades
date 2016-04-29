//Imports the scanner
import java.util.Scanner;

public class Grades {
	public static void main(String[] args){
		
		//Create a scanner to read input
		Scanner input = new Scanner(System.in);
		
		
		//Ask user for number of students
		System.out.println("Please enter the number of students: ");
		int numOfStudents = input.nextInt();
		System.out.println();
		
		
		//Creates an array for holding scores
		int[] scores = new int[numOfStudents];
		int bestscore = 0;
		
		//Get student and score to determine the best
		for(int i = 0; i < numOfStudents; i++) {
			System.out.println("Please enter a score: ");
			scores[i] = input.nextInt();
			
			if(scores[i] > bestscore) {
				bestscore = scores[i];
				
			}
		}
		
		//String to be printed
		String output = "";
		//Grade for students
		char grade; 
		
		//Determine the grade of each student
		for(int i = 0; i < numOfStudents; i++) {
			if(scores[i] >= bestscore - 5) 
				grade = 'A';
			else if(scores[i] >= bestscore - 10)
				grade = 'B';
			else if(scores[i] >= bestscore - 20)
				grade = 'C';
			else if (scores[i] >= bestscore - 30)
				grade = 'D';
			else
				grade = 'F';
			
			output += "Student " + i + " score is " + scores[i] + " and grade is " + grade + "\n"; 
		}
		System.out.println(output);
	}

}
