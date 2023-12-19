package day42_listiterator_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
	public static void main(String[] args) {
		// double ended queue
		// eklemeler veya silmeler baştan veya sondan olabilir. tercih size dkalmaz

		Deque<Integer> deque = new LinkedList<>();
		deque.add(5);
		deque.add(7);
		deque.add(3);

		System.out.println("deque = " + deque);

		deque.addFirst(10);
		deque.addLast(11);

		System.out.println("deque = " + deque);

		deque.offerFirst(6);
		deque.offerLast(4);
		System.out.println("deque = " + deque);

		deque.removeLastOccurrence(5); //List index istiyordu queue veya deque eleman olarak kabul eder. // elemanın son kullanım yerini siler bir tane varsa onu siler

		System.out.println("deque = " + deque);



	}
}
