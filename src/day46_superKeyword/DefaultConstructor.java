package day46_superKeyword;

class B {
	public B() {
		System.out.println("super");
	}
	
	public B(int x) {
		System.out.println("Parameterized");
	}
}

public class DefaultConstructor extends B {
	public DefaultConstructor() {
		//In case of default, here the default super constructor is called implicitly. --> super();
		super(3); // In case of Parameterized.
		System.out.println("Sub");
	}
	
	
	public static void main(String[] args) {
		DefaultConstructor def =  new DefaultConstructor();
		
	}
}
/*
 *All the rules of of the constructor:
      Constructor: is a special method, belongs to the object.    
                 1. Every class MUST have constructor. 
                    (if there isn't any, compiler will give no-arg constructor by default)
                 
                 2. Constructor method cannot have return-types or specifiers
                            return-types: primitives, wrapper class, objects,...
                            specifiers: final, static, abstract
                            
                 3. Constructor' name MUST be same with the ClassName
                 
                 4. constructor' execution depends on the creation of the object
                 
                 5. constructor can only be called in other constructor. 
                                ( methods or blocks cannot call constructor)
                 
                 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
                                this(): calls the class' constructor. (current class constructor)
                                super(): calls the super class' constructor
                                
                 7. constructor cannot call or contain itself. ( Recurrent )
                 
                 8. constructor cannot call more than one constructor
                 
                 9. constructor call MUST be the first step
                 
                 10. class' object MUST be created with existing and visible constructor(s)
                 
                 11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
                 
                 12. at least one of the super class' constructors MUST be called in sub class
                 
				 13. Constructor can be overloaded.
*/
