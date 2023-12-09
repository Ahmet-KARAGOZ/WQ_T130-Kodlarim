package day07_IfElseStatements;

import java.util.Scanner;

public class C02_birimCevirme {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mesafeyi KM olarak giriniz : ");
		double mesafeKm = scanner.nextDouble();

		scanner = new Scanner(System.in);

		System.out.println("Çevirmek istediğiniz birimi Giriniz : ");
		String birim = scanner.nextLine();

		if (birim.equalsIgnoreCase("metre")){
			System.out.println("Girilen meafenin metre cinsinden değeri: "+mesafeKm*1000);
		} else if (birim.equalsIgnoreCase("santimetre")) {
			System.out.println("Girilen mesafenin CM cinsinden değeri: "+ mesafeKm*100000);
		} else {
			System.err.println(("İstediğiniz biirm sisteme  kayıtlı değil!"));
		}
	}
}
