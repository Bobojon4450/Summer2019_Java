package day37_Class_and_Object;

public class CarObjects {
			
/*	instance variable: object variables, MUST be declared in the class and outside any method	*/
/*	local variable: variables that's created within the method	*/
/*	instance methods: methods belong to the object, does not have the specifier static. 
    Designed to work as an instance of the class	*/
	
	public static void main(String[] args) {
	  Car     car    =  new       Car();
//  className  ref      keyword   /*constructor	*/
		car.brand = "BMW";
		car.color = "White";
		car.millage = 100000;
		car.model = "X6";
		car.price = 15000.5;
		car.year = 2000;
		
		System.out.println(car.brand); // BMW
		System.out.println(car.color); // white
		System.out.println(car.millage); // 100000
		System.out.println(car.model);
		System.out.println(car.price);
		System.out.println(car.year);
		System.out.println("=====================================");
		
		Car car2  =  new   Car();

		car2.brand = "Toyota";
		car2.model = "Corolla";
		car2.color = "Black";
		car2.millage = 150000;
		car2.year = 2002;
		car2.price = 2000;
		        
		System.out.println(car2.brand); // toyota
		System.out.println(car2.model); // corolla
		System.out.println(car2.year); // 2002
		System.out.println(car2.millage); // 150000
		System.out.println(car2.color); // black
		System.out.println(car2.price); // 2000
		
		car.drift();
		car.drive();
		car.stop();
		
	}

}
