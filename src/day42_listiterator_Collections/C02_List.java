package day42_listiterator_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
	public static void main(String[] args) {
		List<Integer> sayilar = new LinkedList<>();

		sayilar.add(5);
		sayilar.add(7);
		sayilar.add(10);
		System.out.println("sayilar = " + sayilar);

		sayilar.add(2,44);
		System.out.println("sayilar = " + sayilar);

		List<Integer> digerList = new LinkedList<>();
		digerList.add(44);
		digerList.add(23);
		digerList.add(10);

		System.out.println("digerList = " + digerList);

		sayilar.retainAll(digerList); //digerList te olmayanları sayilar listesinden siler.
		System.out.println("sayilar = " + sayilar);

		System.out.println(sayilar.hashCode());

	}
}
