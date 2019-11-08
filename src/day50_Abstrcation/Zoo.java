package day50_Abstrcation;

public class Zoo {

	public static void main(String[] args) {
		
		Cat kitty = new Cat('m', (byte)3, "Alabula", "Moshong");
			System.out.println(kitty.name);
			System.out.println(kitty.color);
			System.out.println(kitty.gender);
			System.out.println(kitty.age+"\n");
			kitty.getInfo();
		
		Cat misha = new Cat('F', (byte)6, "White & Grey", "misha");
	        misha.getInfo();
	        misha.sleep(10);
	        misha.eat("chicken");
	        misha.drink("milk");
	        misha.voice("meow");
            
        Dog pongo = new Dog('M', (byte)8, "golden", "pongo");
	        pongo.getInfo();
	        pongo.voice("Ukrainian");
	        pongo.eat("Fish");
	        pongo.drink("Vodka");
	        pongo.sleep(7);
                
        Dog tuzik  = new Dog('M', (byte)12, "Black", "Tuzik");
	        tuzik.getInfo();
	        tuzik.drink("redbull");
	        tuzik.eat("Hot dog");
	        tuzik.sleep(10);
	        tuzik.voice("Kyrgyz whoof");
	        
		Dog[] dog = { pongo, tuzik };

		Cat[] cat = { misha, kitty };
		
		dog[0].getInfo();
		dog[1].getInfo();
	}
}
