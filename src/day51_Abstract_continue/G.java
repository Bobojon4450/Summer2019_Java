package day51_Abstract_continue;

abstract class M {
	
	int c = 0;
//	private abstract int minus();
//	final abstract public void method();
	abstract public void nameM();
	protected abstract int add(int x, int y);
	
//	public abstract static void printHello(); //can't be static.
	
}

abstract class N extends M{
	
	@Override
	public void nameM() {System.out.println("N");}
	
	
	public abstract void nameN();
}

 final class G extends N{
	
	@Override
	public void nameN() {
		System.out.println("G");
	}
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		G g = new G();
		System.out.println(g.add(1, 2));
	}
	
}

