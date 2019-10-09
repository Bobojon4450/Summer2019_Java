package day34_Constructors;

public class ConstructorPractice {
 
	public ConstructorPractice() {}
	
	public ConstructorPractice(int x) {System.out.println(x);}
	
//	ConstructorPractice cp = new ConstructorPractice();
	
	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice();
		String str = "he said bla bla bla";
		System.out.println(clean(str, "bla"));
		
	}	
	
	public static String clean (String text ,String badWord) {
        if(text.contains(badWord)){
          text = text.replaceAll(badWord, "");
        }
        return text.trim();
  }
}
