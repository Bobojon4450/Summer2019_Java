package day21_while_loop;

public class do_While {

	public static void main(String[] args) {
		
		/*
			  do{
			  	 statement;
			  }while(condition);
		 */
		
		do {
			System.out.println("Executed anyway!");
		} while (false);
		
/****************************************************/
		
		int i = 1;
		int max = 50;
		
		do {
			if (i % 2 == 0) {
				System.out.print(" "+i);
			}
			i++;
		} while (i <= max);
		System.out.println();
/****************************************************/		
		
		
		
		
		
	}
}
