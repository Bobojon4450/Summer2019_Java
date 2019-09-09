package repl.it;
import java.util.Scanner;

public class SchoolGrades_27 {

	public static void main(String[] args) {
		String subject1,  subject2, subject3,  subject4, subject5, summary;
	    double grade1,  grade2, grade3,  grade4, grade5, average;
	    
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Welcome to the Grader!");
	    System.out.println("Please enter subject name number 1 and score for this subject");
	    subject1 = in.nextLine();
	    grade1 = in.nextDouble();
	    in.nextLine();//takes last ENTER
	    
	    System.out.println("Please enter subject name number 2 and score for this subject");
	    subject2 = in.nextLine();//takes input text-line + ENTER
	    grade2 = in.nextDouble();//takes input double but not ENTER
	    in.nextLine();//takes last ENTER
	    
	    System.out.println("Please enter subject name number 3 and score for this subject");
	    subject3 = in.nextLine();
	    grade3 = in.nextDouble();
	    
	    in.nextLine();
	    System.out.println("Please enter subject name number 4 and score for this subject");
	    subject4 = in.nextLine();
	    grade4 = in.nextDouble();
	    
	    in.nextLine();
	    System.out.println("Please enter subject name number 5 and score for this subject");
	    subject5 = in.nextLine();
	    grade5 = in.nextDouble();
	    
	    summary = "Summary: "+subject1+" - "+ grade1+", "+subject2+" - "+ grade2+", "+subject3+" - "+ grade3+", "+subject4+" - "+ grade4+", "+subject5+" - "+ grade5;
	    average = (grade1+grade2+grade3+grade4+grade5)/5;
	    
	    System.out.println(summary);
	    System.out.println("Your average score is: "+average);
	    System.out.println("Thank you for using Grader!");
	    System.out.println("Goodbye!");
	    in.close();
	}

}
