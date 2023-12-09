package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_SifreOlusturtma {
	public static void main(String[] args) {
		/*
		Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
 				Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin

			sartlar :
						- ilk harf kucuk harf olmali
						- son karakter rakam olmali
						- sifre bosluk icermemeli
						- uzunlugu en az 10 karakter olmali
		 */

		Scanner scanner = new Scanner(System.in);
		int flag = 7;
		String sifre = "";
		while (flag > 0) {
			flag = 0;
			System.out.print("Sifre giriniz : ");
			sifre = scanner.nextLine();
			char ilkHarf = sifre.charAt(0);
			if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
				System.out.println("İlk harf küçük harf olmalı!");
				flag++;
			}

			char sonKarakter = sifre.charAt(sifre.length() - 1);

			if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
				System.out.println("Son karakter rakam olmalı!!");
				flag++;
			}
			if (sifre.contains(" ")) {
				System.out.println("Bosluk olmamalı");
				flag++;
			}
			if (sifre.length() < 10) {
				System.out.println("En az 10 karakter olmalı");
				flag++;
			}

		}

		System.out.println("Sifre basarılı....");

	}
}
