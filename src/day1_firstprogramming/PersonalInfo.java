package day1_firstprogramming;

public class PersonalInfo {

	public static void main(String[] args) {
		String fullName = "Adam Ph";
		String address = "1234 East Main street, McLean VA";
		String carInfo = "Toyota, GreatCar 2017";
		String food = "All kinds of soups and salads";
		String SSN = "123 45 6789";
		
		String items[] = {fullName,address,carInfo,food,SSN};
		for (String string : items) {
			System.out.println(string);
		}
	}

}
