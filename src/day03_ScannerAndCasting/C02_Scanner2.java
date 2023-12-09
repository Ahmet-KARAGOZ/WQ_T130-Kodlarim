package day03_ScannerAndCasting;

import java.util.Scanner;

public class C02_Scanner2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Yaricap Giriniz : ");

		double yariCap = scanner.nextDouble();

		System.out.println("Cemperin cevresi: " + (2 * 3.14 * yariCap));
		System.out.println("Cemberin Alanı: " + (3.14 * yariCap * yariCap));
	}
}
