package day27_Custom_Methods;

public class VoidMethod {

	/*
	 * Methods: 
    		grouping a series of statements together to perform a specific tasks
    		methods can make our codes reusable (don't need to repeat the same set of statements)
	   Method declaration:
    			access-modifier  specifier   return-type  name(){ }
     				public         static     void      method_name() { }
	 */
	public static void main(String[] args) {
		
		printEvenNumbers1_100();
	}

	public static void printEvenNumbers1_100() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
