package day16_methodOlusturma_metohdOverLoading;

import java.util.Scanner;

public class C06_whileSifre2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean sifreDogrumu = true;
		int sifre = 1881;
		int girilenSifre = 0;
		int denemeHakki = 0;

		while (sifreDogrumu) {
			System.out.print("Şifre Giriniz : ");
			girilenSifre = scanner.nextInt();
			if (girilenSifre == sifre) {
				System.out.println("Giriş BAşarılı...");
				sifreDogrumu = false;
			} else {
				denemeHakki++;
				if (denemeHakki == 3) {
					System.out.println("Hakkınız tükenmiştir...");
					sifreDogrumu = false;
				} else {
					System.out.println("Şifre hatalı tekrar deneyiniz!");
					System.out.println("Kalan deneme sayınız : " + (3 - denemeHakki));
				}
			}
		}

	}
}
