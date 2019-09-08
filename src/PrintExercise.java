import java.util.Arrays;
import java.util.List;

public class PrintExercise {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mike", "Smith","Jonny","Monny","HelloMelloGolf","Hotel","MClean","This is B12");
		for (String str : names) {
			if(names.indexOf(str) == 4) {
				System.out.println("\n");
			}
			if (names.indexOf(str) == 7) {
				System.out.println("\n");
			}
			System.out.println(str);
		}
	}

}
