package day50_Abstrcation;

/*
 * WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects

 */


 abstract class Animal implements U{ // Abstract class can override an implemented abstract method

	 public char gender;
	 public byte age;
	 public String color;
	 public String name;
	 
	
	/*This constructor will be called in the extended class constructor	*/
	public Animal(char gender, byte age, String color, String name) {
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.name = name;
	}
	
	/*	Abstract methods are meant to be override	
	 	Access modifiers: public, protected, default.
	 	Return type: primitive, object, void*/
	 	
	  
	public abstract void voice(String languge);
	
    public abstract void eat(String food);
    
    public abstract void sleep(int hour);
    
    public abstract void drink(String drinks);
	
	/*this method is inherited to all classes extending Animal	*/
	public void getInfo() {
		System.out.println("--------------------");
		System.out.println("NickName is " + name);
		System.out.println("Gender is " + gender);
		System.out.println("Color is " + color);
		System.out.println("Age is " + age);
		System.out.println("--------------------");
	}
	
	@Override
	public void aa() {System.out.println("aa");}
}
 
 interface U{
	 public void aa();
 }

