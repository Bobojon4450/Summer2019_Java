package day34_Constructors;

public class B {


	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	 //Add constructors below
	  public B() {
			width =300;
			length=300;
			totalPrice=200;
			isPersian = false;
			unitPrice = 0;
		}
		
		public B(double width, double length, double unitPrice, boolean isPersian) {
		  totalPrice = (width + length) * unitPrice;
		  if(isPersian){
		    totalPrice += 200;
		  }
		}
}
