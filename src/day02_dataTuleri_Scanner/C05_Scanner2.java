package day02_dataTuleri_Scanner;

import java.util.Scanner;

public class C05_Scanner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Double bir sayi Giriniz : ");

		double dbl = scan.nextDouble();

		System.out.println("Bir tam sayi Giriniz : ");

		int tamSayi = scan.nextInt();

		System.out.println("İki Sayının Toplamı : " + (dbl + tamSayi));
		System.out.println("İki sayının Çarpımı : " + (dbl * tamSayi));
	}
}
