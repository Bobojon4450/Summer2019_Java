
public class GasReceipt {

	public static void main(String[] args) {
		String arr[] = {"MCLEAN STORE", "2019-06-19  04:38PM", "Gallons:      10.870", "Price/gallon:  $2.089", "Fuel total:  $22.71"};
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.println(arr[i] + "\n");
				
			}
			else if (i == 1) {
				System.out.println(arr[i] + "\n");
			}
			else if (i == 2) {
				System.out.println(arr[i]);
				System.out.println(arr[i+1] + "\n");
				System.err.println(arr[arr.length-1]);
			}
		}
	}

}
