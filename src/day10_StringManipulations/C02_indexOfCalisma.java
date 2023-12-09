package day10_StringManipulations;

import java.util.Scanner;

public class C02_indexOfCalisma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aram yapılacak metni giriniz : ");
		String metin = scanner.nextLine();
		System.out.println("Aranacak metni Giriniz: ");
		String aranan = scanner.nextLine();

		int sonuc = metin.indexOf(aranan);

		if (sonuc>=0){
			System.out.println("Aradığınız metin "+sonuc+" sayılı karakterdedir" );
		} else {
			System.out.println("Aranan metin bulunamamıştır.");
		}
	}
}
