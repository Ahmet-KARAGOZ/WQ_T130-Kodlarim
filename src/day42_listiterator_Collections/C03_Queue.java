package day42_listiterator_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
	public static void main(String[] args) {

		//Queue eklenenler otomatik olarak sona eklenir silinenler baştan silinir.
		Queue<Integer> queue  = new LinkedList();

		queue.add(6);
		queue.add(9);
		queue.add(2);

		System.out.println("queue = " + queue);

		queue.remove();
		System.out.println("queue = " + queue);
		System.out.println(queue.element()); // en baştaki elementi silmeden bize getirir. AMA silmezz
		System.out.println("queue = " + queue);

		System.out.println(queue.peek()); // peek ile queue aynı işi yapar ANCAKK queue boş ise, element exception verir, peek ise null döner

		queue.offer(7); // kapasite müsaitse eleman ekler yer yoksa exception verir.
		System.out.println(queue.poll());
		System.out.println("queue = " + queue); // remove ile aynı FAKAT boş queue da remove excepiton fırlatır poll null yazdırır.

		System.out.println(queue.isEmpty());


	}
}
