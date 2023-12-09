package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(3);
		sayilar.add(5);
		sayilar.add(2);
		sayilar.add(0);

		System.out.println("sayilar = " + sayilar);

		sayilar.remove(0);
		System.out.println("sayilar = " + sayilar);

		//Eleman olarak 5 isilmesini istersek

		Object silinecekEleman = 5;
		sayilar.remove(silinecekEleman);
		System.out.println("sayilar = " + sayilar);
	}
}
