package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenHarfiOlduguIsimleriListeleme {
	public static void main(String[] args) {

		// Verilen bir String array'de
		// istenen harfi iceren isimleri
		// bir Liste olarak yazdirin


		String[] isimler = {"Derya", "İsmail", "Sedat", "Tugba", "Murat", "Mehmet"};
		String istenenHarf = "e";

		List<String> isimlistesi = new ArrayList<>();

		for (int i = 0; i < isimler.length; i++) {
			if (isimler[i].contains(istenenHarf)) {
				isimlistesi.add(isimler[i]);
			}
		}

		System.out.println(isimlistesi);

	}
}
