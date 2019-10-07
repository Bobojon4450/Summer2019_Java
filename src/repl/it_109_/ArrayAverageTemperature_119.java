package repl.it_109_;

import java.util.Scanner;

public class ArrayAverageTemperature_119 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
		scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
		System.out.print(tempAvarage(temps));
	}
	
	public static double tempAvarage(double [] nums){
	    double avgTemp = 0, total =0;
	    int k = 0;
	    
		for (double num : nums) {
			total += num;
			k++;
		}

		if (k > 0) {
			avgTemp = total / k;
		}
		return avgTemp;
	    
	  }
	
}
