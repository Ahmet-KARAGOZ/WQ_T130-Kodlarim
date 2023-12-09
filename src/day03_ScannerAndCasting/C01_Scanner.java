package day03_ScannerAndCasting;

import java.util.Scanner;

public class C01_Scanner {
	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		System.out.println("Kütfen isminizi Giriniz");
		char isimIlkHarf = scanner.nextLine().charAt(0);

		System.out.println("Soyisim Giriniz : ");
		String soyIsim = scanner.nextLine();

		System.out.println("Yasınızı giriniz : ");
		int yas = scanner.nextInt();

		System.out.println("Grilen Bilgiler :" + isimIlkHarf + " "+ soyIsim+","+" "+yas);
}
}
