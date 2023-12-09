package day02_dataTuleri_Scanner;

import java.util.Scanner;

public class C06_Scanner3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("İsminizi Giriniz : ");

		String isim = scanner.nextLine();

		System.out.println("Soy Adınız : ");

		String soyIsim = scanner.nextLine();

		System.out.println("Yaşınızı Giriniz: ");

		int yas = scanner.nextInt();

		System.out.println("Isminiz : " + isim);
		System.out.println("Soyisminiz : " + soyIsim);
		System.out.println("Yaşınız : " + yas);
		System.out.println("Kaydınız Basarıyla tamamlanmıştır.");
	}
}
