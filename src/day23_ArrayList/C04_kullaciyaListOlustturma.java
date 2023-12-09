package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_kullaciyaListOlustturma {
	public static void main(String[] args) {

		System.out.println(listeOlustur());

	}

	public static List<String> listeOlustur() {
		Scanner scanner = new Scanner(System.in);
		List<String> girilenIsimlerListesi = new ArrayList<>();
		String girilenIsim = "";

		while (!girilenIsim.equalsIgnoreCase("q")){
			System.out.println("Listeye Ekelnecek isim giriniz\n bitirmek için Q'ya basınız.");
			girilenIsim = scanner.nextLine();

			//listeye ne eklediğini bilmediğimizden eklemeden önce kontrol edelim.

			if (!girilenIsim.equalsIgnoreCase("q")){
				girilenIsimlerListesi.add(girilenIsim);
			}
		}
		return girilenIsimlerListesi;

	}
}
