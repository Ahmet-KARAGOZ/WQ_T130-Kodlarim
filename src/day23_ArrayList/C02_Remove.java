package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
	public static void main(String[] args) {
		String[] harfler = {"J", "a", "v", "l", "b", "b", "a"};
		List<String> harfListesi = new ArrayList<>();

		for (int i = 0; i < harfler.length; i++) {
			harfListesi.add(harfler[i]);
		}
		System.out.println("harfListesi = " + harfListesi);

		System.out.println(harfListesi.remove("a")); //true
		System.out.println("harfListesi = " + harfListesi);

		System.out.println(harfListesi.remove("s")); //false
		System.out.println("harfListesi = " + harfListesi);

		System.out.println(harfListesi.remove(2));
		System.out.println("harfListesi = " + harfListesi);

		List<String> silinenHarfler = new ArrayList<>();
		System.out.println(silinenHarfler.add(harfListesi.remove(1)));

		System.out.println("silinenHarfler = " + silinenHarfler);

	}
}
