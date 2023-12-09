package day06_IfStatements;

import java.util.Scanner;

public class C01_ifStatements {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sayıyı Giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2. Sayıyı Giriniz: ");
		int sayi2 = scanner.nextInt();

		if (sayi1 > sayi2) {
			System.out.println("Aferin");
		}

		if (sayi1 % 2 == 0) {
			System.out.println("Çift Sayıları Severim");
		}

		if (sayi2 > 50) {
			System.out.println("Büyük Sayılarla işim Olmaz");
		}

		if ((sayi1 + sayi2) < 100) {
			System.out.println("Ufak sayılarla işim olmaz");
		}

		if (sayi1 % 3 != 0) {
			System.out.println("Ah bide 3'e Bölünse");
		}


	}


}
