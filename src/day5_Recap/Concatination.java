package day5_Recap;

public class Concatination {

	public static void main(String[] args) {
		
		String str = "Hello World !!!";
		System.out.println(str);
		
		String str2 = "Mukhtar";
		System.out.println(str.substring(0,6)+ str2);
		
		String str3 = "This is "+ 2019 + " Batch12";
		System.out.println(str3);
		
		int cucumber = 3;
		int tomato = 5;
		
		System.out.println("Cucumber costs: $"+cucumber+" lb");
		
		System.out.println("1"+ 2 + 3);//123
//		System.out.println("1" + 1 - 3); won't compile because of - sign
		
		System.out.println("Batch 12"+1+2);//Batch 121 => Batch 1212
		
		System.out.println(2 - 1 + "4");//2-1 = 1 + "4" => 14
		
		System.out.println("Batch 12" + (1+2));// Batch 123
		
		System.out.println(1 + "123" + 4 + 5);//112345
		
		System.out.println(1 + (1 + "2"));//112
		
		System.out.println((1+3) - '9');//-53 
		
		System.out.println('3' + 3);//char '3' = 51 -> 51 + 3 = 54
		
		String name = "I like the book called \'The Game of Thrones\'";
		System.out.println(name);
		
		//if we concat char to a String, char is concatenated as char
		System.out.println("3" + '3');//33
		System.out.println('7' + "3");//73
		
		
		//if we concat char to a number, representive number of char will be added. 
		System.out.println(4 + '3');// 55
		System.out.println('7' + 3);// 55+3 = 58
		
		//if we concat char to a number(whole, decimal), representive number of char
		//will be added and returned according to type of data. 
		System.out.println(4.0 + '3');//55.0
		
		
	 
		
		
		
		
		
		
		
	}
}
