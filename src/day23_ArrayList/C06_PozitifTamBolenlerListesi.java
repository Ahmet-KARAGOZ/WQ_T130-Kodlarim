package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {
	public static void main(String[] args) {
		int sayi = 200;
		List<Integer> tamBolenler = new ArrayList<>();

		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				tamBolenler.add(i);
			}
		}
		System.out.println("Tam Bolenler = " + tamBolenler);
	}
}
