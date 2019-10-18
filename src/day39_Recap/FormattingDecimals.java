package day39_Recap;

import java.text.DecimalFormat;
import java.text.ParseException;

public class FormattingDecimals {

	public static void main(String[] args) throws ParseException {
		
		DecimalFormat frt = new DecimalFormat("0.00");
		double num = 23.4547899003456;
		/* format(): formats the decimals and returns string value */
		String formatted = frt.format(num);
		System.out.println(formatted);
		double newNum = Double.parseDouble(frt.format(num));
		System.out.println(newNum);
		
		
		
		
	}

}
