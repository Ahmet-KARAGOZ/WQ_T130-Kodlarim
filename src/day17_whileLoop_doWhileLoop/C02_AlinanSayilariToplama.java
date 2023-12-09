package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_AlinanSayilariToplama {
	public static void main(String[] args) {
		//Kullanıcıdan sayılar alın toplm 500 ü geçerse
		// Bu kadar sayı yeter .... adet sayı girdiniz toplamı .... adet oldu yazdırın ve bitirin

		Scanner scanner = new Scanner(System.in);
		double toplam = 0;
		double sayi =0;
		int sayac = 0;

		while (toplam<=500){
			System.out.print("Toplama için bir sayı giriniz : ");
			sayi = scanner.nextDouble();
			sayac++;
			toplam+=sayi;
		}
		System.out.println("Bu kadar sayı yeter!");
		System.out.println("Toplam "+ sayac+" adet sayı girdiniz, "+"toplamları "+toplam);
	}
}
