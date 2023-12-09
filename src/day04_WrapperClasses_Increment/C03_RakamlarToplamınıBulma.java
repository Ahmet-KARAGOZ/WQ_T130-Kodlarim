package day04_WrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("4 basamakli Bir Sayi Giriniz: ");
		int sayi = scanner.nextInt();

		int toplam = 0;

		toplam = sayi % 10;
		sayi = sayi / 10;

		toplam = toplam + (sayi % 10);
		sayi = sayi / 10;

		toplam = toplam + (sayi % 10);
		sayi = sayi / 10;

		toplam = toplam + sayi;

		System.out.println("Toplam değer : " + toplam);


	}
}
