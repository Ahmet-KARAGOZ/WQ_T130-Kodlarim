package day03_ScannerAndCasting;

import java.util.Scanner;

public class C03_Scanner3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Sayıyı Giriniz");
		int sayi1 = scanner.nextInt();

		System.out.println("2. Sayıyı Giriniz");
		int sayi2 = scanner.nextInt();

		int sayi3;
		sayi3 = sayi1;
		sayi1 = sayi2;
		sayi2 = sayi3;

		System.out.println("Girilen ikinci Sayi : " + sayi1);
		System.out.println("Girilen birinci Sayi : " + sayi2);

	}
}
