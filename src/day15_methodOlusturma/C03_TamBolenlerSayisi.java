package day15_methodOlusturma;

import java.util.Scanner;

public class C03_TamBolenlerSayisi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir Tam sayı giriniz : ");
		int sayi = scanner.nextInt();

		System.out.println(pozitifTamBolenSayisi(sayi));

	}

	public static int pozitifTamBolenSayisi(int sayi) {
		int sayac = 0;
		for (int i = 1; i <= sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}
		return sayac;
	}
}
