package day53_InterfaceContinue;

public interface Extends_vs_Implements extends B {

	void method1();	//public
	void method2();	//public
	//void method3();  here from interface B	
}

interface B{
	void method3();
}



class A implements Extends_vs_Implements{

	public void method1() {
	
	}

	public void method2() {
	
	}

	public void method3() {
	
	}
}