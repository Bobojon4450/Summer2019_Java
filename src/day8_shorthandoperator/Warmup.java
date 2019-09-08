package day8_shorthandoperator;

public class Warmup {

	public static void main(String[] args) {
		
		// 1 gallon = 3.785 litters;
		// 1 litter = 1 / 3.785;
		
		int gallons = 100;
		double litters = gallons * 3.875;
		
		System.out.println(gallons +" gallons = "+litters +" litters");
		
		
		System.out.println("---------------------------------");
		
		//litter = 0.264172 gallon
		double litter = 1;
		double gallon = litter / 3.785;
		System.out.println(litter+ " litter = " + gallon +" gallons");
		
		System.out.println("---------------------------------");
		//	Task-1
		int x = 2 ;
		int y = x++; //y = 2; x = 3;
		
		System.out.println(x + " " +y);
		
		int x2 = 2;
		System.out.println(x2++);
		System.out.println(x2);
		
		int x3 = 2;
		System.out.println( --x3);//1
		
		int x4 = 8;
		int y2 = x4--;
		System.out.println(y2);//8
		
		
	}

}
