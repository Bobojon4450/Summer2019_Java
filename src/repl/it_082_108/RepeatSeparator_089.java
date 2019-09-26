package repl.it_082_108;
import java.util.Scanner;

public class RepeatSeparator_089 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = in.next();
		System.out.println("Enter the separator: ");
	    String separator = in.next();
	    System.out.println("Enter the count: ");
	    int count = in.nextInt();
	    
	    String str = new String();
	    int occurance = count;
	    
	    for(int i = 1; i <= count; i++){
	       str = str.concat(word);
	       if(occurance > 1){
	         str = str.concat(separator);
	         occurance--;
	       }
	    }
	    System.out.print(str);
	}

}
