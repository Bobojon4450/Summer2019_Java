package ZZ;

public class Child extends Papa{

	public Child() {
		super();
		System.out.println("Child constractor");
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.var);
		ch.var = 20;
		System.out.println(ch.var);
		ch.add();
	}
}
