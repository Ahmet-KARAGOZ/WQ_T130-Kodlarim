package day02_dataTuleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Adinizi Giriniz: ");

		String isim = scan.nextLine(); //next() sadece ilk kelimeyi alır nextLine() girilen tüm bilgiyi alır.
		System.out.println(isim.toUpperCase());
	}
}
