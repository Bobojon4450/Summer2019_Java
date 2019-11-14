package day39_Recap;

public class CellPhoneObjects {

	public static void main(String[] args) {
		CellPhone cl = new CellPhone("Iphone", 4.9, "Silver", 699.99);
		System.out.println(cl.brand);
		System.out.println(cl.color);
		System.out.println(cl.str);
		System.out.println(cl.price+"\n");
		
		CellPhone cl2 = new CellPhone("Samsung", 2.2, "seriy", 232.22);
		System.out.println(cl2.brand);
		System.out.println(cl2.color);
		System.out.println(cl2.price);
		System.out.println(cl2.str);
		cl2.str = " : changed from another class";
		System.out.println(cl2.str+"\n");
		
		CellPhone cl3 = new CellPhone();// 0
		System.out.println(cl3.str);
		
		
		CellPhone [] phones = {cl, cl2,cl3};
		System.out.println(phones[1].brand);
		
		CellPhone cl4 = new CellPhone(); // 1
		System.out.println(cl4.i);//2
		System.out.println(cl4.j);
		cl4.print();
		CellPhone.print();
		
	}
}
