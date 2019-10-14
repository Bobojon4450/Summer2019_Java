package repl.it_109_180;

import java.util.Arrays;

public class ZombieAttack_138 {

	public static void main(String[] args) {

		int[] a = { 3, 6, 0, 4, 3, 2, 7, 1 };
//		zeroedZombie(a);
		zombieLand(a);
	}

	public static void zeroedZombieLand(int[] array) {

		boolean keepGoing = true;
		int j = 0; /* this variable for printing days */
	
		while (keepGoing) {
			int[] arrayCopy = array;

			// first element
			if (array[0] == 0) {
				arrayCopy[1] = array[1] / 2;
			} // { 3, 6, 0, 4, 3, 2, 7, 1 };

			// element in the middle
			for (int i = 1; i < array.length - 1; i++) {
				if (array[i] == 0) {
					arrayCopy[i - 1] = array[i - 1] / 2;
					arrayCopy[i + 1] = array[i + 1] / 2;
				}
			}

			// last element
			if (array[array.length - 1] == 0) {
				arrayCopy[array.length - 1] = array[array.length - 1] / 2;
			}

			System.out.println("Day " + j);
			// copies clone back to original array
			array = arrayCopy;
			System.out.println(Arrays.toString(array));

			j++;

			int counter = 0;
			// for each element checking if every city is zero.
			for (int element : array) {
				counter = counter + element;
			}

			// if each element value in every city is zero, we stop
			if (counter == 0) {
				keepGoing = false;
			}
		}
	}

	public static int[] zeroedZombie(int[] arr) {
		int days = 1;
		boolean keepGoing = true;

		while (keepGoing) {

			int copy[] = arr;
			
			/*	first element	*/
			if (arr[0] == 0) {
				copy[1] = arr[1] / 2;
			}

			/* since we checked array[0] previously we start from 1 */
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i] == 0) {
					copy[i - 1] = arr[i - 1] / 2;
					copy[i + 1] = arr[i + 1] / 2;
				}
			} 

			/*	last element	*/
			if (arr[arr.length - 1] == 0) {
				copy[arr.length - 1] = arr[arr.length - 1] / 2;
			}
			
			System.out.print("Day "+days+" --> ");
			arr = copy;
			System.out.println(Arrays.toString(arr));
			days++;
			
			/*	for each element checking if every city is zero	*/
			int count = 0;
			for (int i : arr) {
				count += i;
			}
			
			/*	if each element value in every city is zero, we stop	*/
			if (count == 0) {
				keepGoing = false;
			}
		}

		return arr;
	}

	/* 	Zuhal's approach		*/
	private static void zombieLand(int[] inhabitants) {
		int[] copy = inhabitants;
		int days = 0;
		String str = Arrays.toString(inhabitants);
		System.out.println("Day " + days + " " + str);

		while (!str.equals("[0, 0, 0, 0, 0, 0, 0, 0]")) { // Day 0 [3, 6, 0, 4, 3, 2, 7, 0]

			if (inhabitants[1] == 0) {
				copy[copy.length - copy.length] = copy[copy.length - copy.length] / 2;
			}

			if (inhabitants[inhabitants.length - 2] == 0) {
				copy[copy.length - 1] = copy[copy.length - 1] / 2;
			}

			for (int i = 1; i < copy.length - 1; i++) {
				if (inhabitants[i + 1] == 0 || inhabitants[i - 1] == 0) {
					copy[i] = copy[i] / 2;
				}
			}

			inhabitants = copy;
			str = Arrays.toString(inhabitants);
			days++;
			System.out.println("Day " + days + " " + str);
		}
		System.out.println("---- EXTINCT ----");
	}

}
