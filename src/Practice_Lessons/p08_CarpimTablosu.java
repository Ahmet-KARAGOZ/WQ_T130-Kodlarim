package Practice_Lessons;

import java.util.Scanner;

public class p08_CarpimTablosu {
	public static void main(String[] args) {
		/*
		Kullanicinin girdigi sayiya kadar carpim tablosunu
        yazdiran bir method create ediniz
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaça kadar yazdırmak istiyorsunuz : ");
		int input = scanner.nextInt();
		carpimTablosuYazdir(input);
	}

	public static void carpimTablosuYazdir(int sayi) {
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= sayi; j++) {
				System.out.printf("%4d",i*j);
			}
			System.out.println("");
		}
	}
}
