package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_IstenmeyenIsimeriSilme {
	public static void main(String[] args) {
		List<String> isimler = new ArrayList<>();
		isimler.add("Meltem");
		isimler.add("Ramazan");
		isimler.add("Saido");
		isimler.add("Kaan");
		isimler.add("Kamil");
		isimler.add("Eren");

		String istenmeyenHarf = "i";

		List<String> silinenIsimler= new ArrayList<>();

		for (int i = 0; i < isimler.size(); i++) {
			if (isimler.get(i).contains(istenmeyenHarf)){
				silinenIsimler.add(isimler.remove(i));
				i--; // isim silinip index numaraları değiştiğinden dolayı bir öncekinden başlaması için
			}
		}
		System.out.println("Kalan isimler : = " + isimler);
		System.out.println("Silinen Isimler = " + silinenIsimler);
	}
}
