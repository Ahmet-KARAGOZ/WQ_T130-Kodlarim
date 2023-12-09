package day12_stringManipulations;

import java.util.Scanner;

public class C05_Sifre_Soru {
	public static void main(String[] args) {
		/*
		Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
					  - ilk harf kucuk harf olmali
					  - son karakter rakam olmali
					  - sifre bosluk icermemeli
					  - uzunlugu en az 10 karakter olmali
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sifre Giriniz : ");
		String sifre = scanner.nextLine();

		boolean flag = true;

		if (sifre.charAt(0) < 'a' || sifre.charAt(0) > 'z') {
			System.out.println("İlk harf küçük olmalı");
			flag = false;
		}

		if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
			System.out.println("Son karakter rakam olmalı");
			flag = false;
		}

		if (sifre.contains(" ")) {
			System.out.println("Sifre boşluk içermemeli");
			flag = false;
		}

		if (sifre.length() < 10) {
			System.out.println("Minmum 10 karakter olmalı");
			flag = false;
		}

		if (flag) {
			System.out.println("Şifre olusturma basarılı:)");
		}
	}
}
