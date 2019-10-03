package repl.it_099;

import java.util.Scanner;

public class ArraysReverseSentence_103 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String reversed = "";
	    String[] arr = sentence.split(" ");
	    for (int i = arr.length - 1; i >= 0; i--) {
	    	reversed += arr[i]+" ";
		}
	    System.out.println(reversed.trim());
	    

	}

}
