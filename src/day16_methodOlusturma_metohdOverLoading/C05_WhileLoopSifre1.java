package day16_methodOlusturma_metohdOverLoading;

import java.util.Scanner;

public class C05_WhileLoopSifre1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sifre = 1881;
		int girilenSifre = 0;
		int denemeSayisi = 0;

		while (denemeSayisi <= 2) {
			System.out.print("Lütfen sifrenizi giriniz : ");
			girilenSifre = scanner.nextInt();

			if (girilenSifre == sifre) {
				System.out.println("Giriş Başarılı...");
				break;

			} else {

				denemeSayisi++;
				if (denemeSayisi == 3) {
					System.out.println("Hakkınız tükenmiştir!");
					break;
				}
				System.out.println("Şifre yanlış tekrar deneyiniz!");

			}


		}

	}
}
