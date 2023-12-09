package day15_methodOlusturma;

import java.util.Scanner;

public class C02_AsalSayiMetodu {
	public static void main(String[] args) {
		/*

		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pozitif bir tam sayı giriniz : ");
		int sayi = scanner.nextInt();

		asalsayimi(sayi);

	}

	public static void asalsayimi(int sayi) {
		int flag = 20;
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				flag++;
				break;
			}
		}
		if (flag == 20) {
			System.out.println("ASAL SAYI");
		} else {
			System.out.println("ASAL DEĞİLDİR!");
		}
	}
}
