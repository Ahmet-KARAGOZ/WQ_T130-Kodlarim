package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<String> isimlerListesi = new ArrayList<>();
		List<Double> notlarListesi = new ArrayList<>();

		double girilenNot = 0;
		double notToplami = 0;
		String girilenIsim = "";

		while (!girilenIsim.equalsIgnoreCase("q")){
			scanner = new Scanner(System.in);
			System.out.print("Ogrenci ismini giriniz : ");
			girilenIsim =scanner.nextLine();
			if (!girilenIsim.equalsIgnoreCase("q")){
				isimlerListesi.add(girilenIsim);
				System.out.print("Lutfen Ogrenci notunu girirniz : ");
				girilenNot = scanner.nextDouble();
				notToplami+=girilenNot;
				notlarListesi.add(girilenNot);
			}
		}

		double ortalama = notToplami / notlarListesi.size();

		System.out.println("------- Ortalama ÜZerinde Not Alan Öğrenciler -------");
		for (int i = 0; i < notlarListesi.size(); i++) {
			if (notlarListesi.get(i)>=ortalama){

				System.out.println(isimlerListesi.get(i)+ " Notu: "+notlarListesi.get(i));
			}
		}



	}
}
