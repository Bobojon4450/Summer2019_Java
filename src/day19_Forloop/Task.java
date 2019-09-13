package day19_Forloop;

public class Task {

	public static void main(String[] args) {
	
	// task01 
    //  for(int i = 1; i <= 10; i++) {
    //      System.out.println("the square of "+ i + " is: " + (i * i) );
    //  }
        
        
        // task02 Even numbers between 1 -32
        for(int i = 1; i <= 32; i++) {
            if(i %2 == 0) {
                System.out.print(i+" ");
            }  
        }
        System.out.println();
        
        
        // task03: Odd numbers between 1 -32
        for(int i = 1; i <= 32; i++) {           
            if(i %2 == 1) {
                System.out.print(i+" ");
            }          
        }
        System.out.println();
        
        
        String str = "Cybertek";
        //            01234567
        //            "avaJ"
        String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        
        String Reversed ="";
        for(int i = str.length()-1 ; i >= 0; i--) {
            Reversed += str.charAt(i);
        }
        System.out.println(Reversed);

        String t = "A ";
        t = t.concat("B ");
        String b = "C ";
        t = t + b;
        t.replace('C', 'D');//was not caught
        System.out.println(t);
        t = t + b;
        System.out.println(t);//A B C C 
        
        String s = "abc";
        String s2 = "abc";
        System.out.println("s==s2 is:" + s == s2);
        
        
	}
}
