package day15_methodOlusturma;

import java.util.Scanner;

public class C01_KendiSubstringimiz {
	public static void main(String[] args) {
		/*

		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Metin giriniz : ");
		String metin = scanner.nextLine();
		System.out.print("Başlangıç indexini giriniz : ");
		int baslangic = scanner.nextInt();
		System.out.print("Bitiş indexini giriniz : ");
		int bitis = scanner.nextInt();

		if (baslangic > bitis) {
			System.out.println("Başlangıç bitişten büyük olmalıdır.");
		} else if (baslangic >= metin.length() || bitis>= metin.length()) {
			System.out.println("indexler metin dışında");
		} else {
			for (int i = baslangic; i < bitis ; i++) {
				System.out.print(metin.charAt(i));
			}
		}

	}
}
