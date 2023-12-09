package day03_ScannerAndCasting;

import java.util.Scanner;

public class C04_Scanner4_Odev {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Sayıyı Giriniz : ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Sayıyı Giriniz : ");
		int sayi2 = scanner.nextInt();

		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;

		System.out.println("1.Sayının yeni değeri : "+sayi1);
		System.out.println("2.Sayının yeni değeri : "+sayi2);

	}
}
