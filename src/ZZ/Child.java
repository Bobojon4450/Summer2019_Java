package ZZ;

public class Child extends Papa{

	Child() {
		super();
		System.out.println("Child constractor");
	}
	
	private void doStuff() {
		System.out.println("just do stuff child class");
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.var);// default inherited
		ch.var = 20; // reassign
		System.out.println(ch.var); //20
		ch.add();
		ch.doStuff();
		ch.add();
	}
}
