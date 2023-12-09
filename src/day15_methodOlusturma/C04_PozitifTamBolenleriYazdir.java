package day15_methodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
	public static void main(String[] args) {

		/*
		Soru 4- Kullanicidan main method icinde bir tamsayi alin.
				  Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
				  bir method olusturun.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir Tam sayı giriniz : ");
		int sayi = scanner.nextInt();

		System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(sayi) + " Adet");

		pozitifBolenleriYazdir(sayi);
	}

	public static void pozitifBolenleriYazdir(int sayi) {
		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
