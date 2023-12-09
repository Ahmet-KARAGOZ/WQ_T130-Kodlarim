package day08_Nested_if_Else;

import java.util.Scanner;

public class C08_OrnekSoru {
	public static void main(String[] args) {
		/*
			Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
			“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
			gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
			zamani” yazdirin.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Günü yazınız : ");
		String gun = scanner.next().toLowerCase();
		int gunSayisi=0;

		if (gun.equals("pazartesi")) gunSayisi = 1;
		if (gun.equals("sali")) gunSayisi = 2;
		if (gun.equals("carsamba")) gunSayisi = 3;
		if (gun.equals("persembe")) gunSayisi = 4;
		if (gun.equals("cuma")) gunSayisi = 5;
		if (gun.equals("cumartesi")) gunSayisi = 6;
		if (gun.equals("pazar")) gunSayisi = 7;


		System.out.println("gunsayısı : " + gunSayisi);

		if (gunSayisi == 0) {
			System.out.println("Gun ismini kontrol ediniz!");
		} else if (gunSayisi < 6) {
			System.out.println("Şimdi çalışma zamanı tatile " + (6 - gunSayisi) + " gun var");
		} else {
			System.out.println("Şimdi dinlenme zamanı");
		}


	}
}
