package day3_variables;

public class Println_vs_Print {

	public static void main(String[] args) {
		System.out.println("Hi Everyone");
		System.out.print("How are you guys? ");
		System.out.print("Have a nice day!");
		
		
		System.out.print("\n\n\nHave a nice day!");
		System.out.print("Have a nice day!");
		System.out.print("\rHave a nice day!");//	\r works as well
		
		System.out.print("\tHave a nice day!");// adds tab
		
		System.out.print("\\Have a nice day!\n");// prints backslash
		
		System.out.print("\'Have a nice day!\n");// prints single quote
		
		System.out.print("The book is called \"The Game of Throne\"");// prints double quote
		
		
		
	}
}
