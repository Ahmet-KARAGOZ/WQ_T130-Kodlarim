package day11_StringManipulations;

import java.util.Scanner;

public class C03_idexOfSoru {
	public static void main(String[] args) {
												// Kullanicidan bir cumle ve cumlede aranacak metin isteyin
												// cumle ve metni karsilastirip
												// asagidaki 3 durumdan birini yazdirin
												// 1- verilen metin cumlede kullanilmamis
												// 2- verilen metin cumlede sadece 1 kere kullanilmis
												// 3- verilen metin cumlede 1'den fazla kere kullanilmis

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir cümle giriniz : ");
		String cumle = scanner.nextLine();

		System.out.print("Aranacak metni giriniz : ");
		String aranan = scanner.nextLine();

		if (!cumle.contains(aranan)) {
			System.out.println("Aranan metin kullanılmamıştır.");
		} else if (cumle.indexOf(aranan) == cumle.lastIndexOf(aranan)) {
			System.out.println("Aranan sadece bir kere kullanılmıştır.");
		} else {
			System.out.println("Aranan metin birden fazla kullanılmıştır.");
		}


	}
}
