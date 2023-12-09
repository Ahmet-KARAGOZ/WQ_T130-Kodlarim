package day14_ForLoopExamples;

import java.util.Scanner;

public class C05_AsalSayi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pozitif Tam sayı giriniz : ");
		int sayi = scanner.nextInt();

		boolean flag = true;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				flag = false;
				break; // Tüm sayıları artık denemesine gerek yok sadece kalansız bir bölen olması yterlidir.
			}
		}
		if (flag) {
			System.out.println("Asal sayı");
		} else {
			System.out.println("Asal Değil");
		}
	}
}
