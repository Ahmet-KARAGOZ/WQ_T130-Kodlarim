package day13_For_Loop;

import java.util.Scanner;

public class C07_odevSoru {
	public static void main(String[] args) {
		//Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
		// Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
		Scanner scanner = new Scanner(System.in);
		System.out.print("20 ten küçük bir sayı giriniz : ");
		int sayi = scanner.nextInt();

		long faktoriyel = 1;
		String str = "" + sayi + "! = " + sayi; //6! = 6
		for (int i = sayi; i >= 1; i--) {
			faktoriyel *= i;
			if (i < sayi) str = str + " * " + i; // ilk sayıyı (6) tekrar yazdırmasın diye if kullanıp bunu kontrol ettik diğer sayıların sol tarına boşluk * boşluk ve i değerini ekledik.
		}
		System.out.println(str + " = " + faktoriyel);


	}
}
