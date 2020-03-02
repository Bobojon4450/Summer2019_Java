package day64_Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		/* Not indexed, unsorted/unordered, Duplicates allowed */
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(11);
		q1.add(20);
		q1.add(30);
		q1.add(10);
		q1.add(10);
		System.out.println("(I)Queue <-> PriorityQueue:\t" + q1); // [10, 10, 30, 20, 11]
		q1.poll(); // FIFO - returns the first entered object of the collection and removes it instantly.
		System.out.println("(I)Queue <-> PriorityQueue:\t" + q1); // [10, 11, 30, 20]
		q1.poll();
		System.out.println("(I)Queue <-> PriorityQueue:\t" + q1); // [11, 20, 30]
		System.out.println("----------------------------------------------------");

		/* Queue<E>:	Not indexed, unsorted/unordered, Duplicates allowed 
		 * 
		 * poll(); -> Retrieves and removes the head of this queue
		 * add();  -> Inserts the specified element into this queue
		 * peek(); -> returns the head of this queue
		 * 
		 * */
		Queue<String> q2 = new PriorityQueue<String>();
		q2.add("Adam");
		q2.add("Zuhal");
		q2.add("Junhe");
		q2.add("Marina");
		q2.add("Marina");
		q2.add("Tuna");
		q2.add("Adam");
		System.out.println("(I)Queue <-> PriorityQueue:\t" + q2); // [Adam, Marina, Adam, Zuhal, Marina, Tuna, Junhe]
		System.out.println("q2.peek(): "+q2.peek()); // returns the first element of collection.
		System.out.println("(I)Queue <-> PriorityQueue:\t" + q2); // [Adam, Marina, Adam, Zuhal, Marina, Tuna, Junhe]
		q2.poll(); // returns the first element of collection and removes it instantly.
		System.out.println("(I)Queue <-> PriorityQueue:\t"+q2); // [Adam, Marina, Junhe, Zuhal, Marina, Tuna]
		q2.poll();
		System.out.println("(I)Queue <-> PriorityQueue:\t"+q2);
		System.out.println("----------------------------------------------------");
		
		
		/* Deque<E>:	Not indexed, unsorted/unordered, Duplicates allowed 	
		 * addFirst();
		 * addLast();
		 * removeFirst();
		 * removeLast();
		 * add(); -> adds from the back.
		 * */
		Deque<Integer> q3 = new ArrayDeque<Integer>();
		q3.addFirst(10);
		q3.addFirst(10);
		q3.addFirst(10);
		q3.addFirst(20);
		q3.addFirst(1);
		q3.addFirst(30);
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3+"\n"); // [30, 1, 20, 10, 10, 10]
		
		q3.addLast(40); /* adds 40 as the last element of the collection */
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3);// [30, 1, 20, 10, 10, 10, 40]
		
		q3.addLast(5); //	[2, 30, 1, 20, 10, 10, 10, 40, 5]
		q3.addFirst(2);
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3); //[2, 30, 1, 20, 10, 10, 10, 40, 5]
		
		q3.removeFirst(); /* removes the first element of the collection instantly. */
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3); //[30, 1, 20, 10, 10, 10, 40, 5]
		
		q3.removeLast(); /* removes the last element of the collection instantly. */
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3); //[30, 1, 20, 10, 10, 10, 40]
		
		q3.add(11); /* adds from the back. */
		q3.add(12);
		System.out.println("(I)Deque <-> (C)ArrayDeque:\t"+q3); // [30, 1, 20, 10, 10, 10, 40, 11, 12]
		System.out.println("----------------------------------------------------");
		
	}
}
