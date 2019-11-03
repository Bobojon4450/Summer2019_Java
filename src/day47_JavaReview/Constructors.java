package day47_JavaReview;


class Mahmet{
	public Mahmet() {
		System.out.println("Mehmet");
	}
}


class Russel extends Mahmet{
	public Russel() { //here Mahmet constructor is called implicitly since it is default.
		System.out.println("Russel");
	}
}


class Zuhal extends Russel{
	public Zuhal() {//here Mahmet and Russel constructors are called implicitly since they are default.
		System.out.println("Zuhal");
	}
}
public class Constructors {
	public static void main(String[] args) {
		/* here Mahmet,Russel and Zuhal constructors will be run by default.*/
		Zuhal zz = new Zuhal();
	}
}
