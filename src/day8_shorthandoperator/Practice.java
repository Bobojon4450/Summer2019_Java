package day8_shorthandoperator;

public class Practice {

	public static void main(String[] args) {
		
		String outsideWeather;
		int degree;
		outsideWeather = "Shiny";
		degree = 70;
		boolean comp = (!(outsideWeather == "Rainy" || degree == 70));
		System.out.println("comp = "+comp);//prints false.
		System.out.println("-------------------------");
		
		int b = 2;//3//2//1
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		System.out.println("res = "+res);
		System.out.println("-------------------------");
		
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) || (z = false);
		System.out.println("x = " + x);
		System.out.println("-------------------------");
		
		
		
		
		
	}

}
