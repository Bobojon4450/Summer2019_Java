package day25_ArraysContinue;

public class WarmUp {

	public static void main(String[] args) {
		
		int [] arr = {1, 1, 2, 2, 3, 4, 4, 4, 4, 9, -1};
		
		for (int j = 0; j < arr.length; j++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[j]);
			}
		}
		
		System.out.println("--------------------");
		
		
	}
}
