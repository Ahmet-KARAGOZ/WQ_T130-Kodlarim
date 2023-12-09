package Practice_Lessons;

import java.util.Scanner;

public class p06_IfStatements_DogumGunuKiyas {
	public static void main(String[] args) {
		/*
		Kullanicidan iki farkli dogum gunu tarihini alip,
    	kimin once dogdugunu consolda yazdiran bir program yaziniz.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("İlk dogum tarihini YYYY/AA/GG formatında  giriniz : ");
		String dogumTarihi1 = scanner.nextLine();

		System.out.println("İkinci dogum tarihini YYYY/AA/GG formatında  giriniz : ");
		String dogumTarihi2 = scanner.nextLine();

		int yil1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(0, 4));
		int ay1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(5, 7));
		int gun1 = Integer.parseInt(dogumTarihi1.replaceAll(" ", "").substring(8));


		int yil2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(0, 4));
		int ay2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(5, 7));
		int gun2 = Integer.parseInt(dogumTarihi2.replaceAll(" ", "").substring(8));

		if (yil1 > yil2) System.out.println("2. Kişi daha buyuktur.");
		else if (yil1 < yil2) System.out.println("1. Kisi daha buyuk.");
		else {
			if (ay1 > ay2) System.out.println("2. Kişi daha buyuktur.");
			else if (ay1 < ay2) System.out.println("1. Kisi daha buyuk.");
			else {
				if (gun1 > gun2) System.out.println("2. Kişi daha buyuktur.");
				else if (gun1 < gun2) System.out.println("1. Kisi daha buyuk.");
				else {
					System.out.println("Aynı gun dogmussunuz");
				}
			}
		}


	}
}
