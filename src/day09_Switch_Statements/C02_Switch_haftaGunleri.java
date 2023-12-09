package day09_Switch_Statements;

import java.util.Scanner;

public class C02_Switch_haftaGunleri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir gün Giriniz : ");
		String gun = scanner.next().toLowerCase();

		switch (gun) {
			case "pazartesi":
			case "sali":
			case "carsamba":
			case "persembe":
			case "cuma":
				System.out.println("Hafta İçi");
				break;
			case "cumartesi":
			case "pazar":
				System.out.println("Hafta Sonu");
				break;
			default:
				System.out.println("Yanlış Gün!!");


		}


	}
}
