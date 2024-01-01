package Practice_Lessons;

import java.util.Scanner;

public class AnaMenu {
	void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t====================================\n" +
				"\tÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
				"\t====================================\n" +
				"\t\t1- ÖĞRENCİ İŞLEMLERİ\n" +
				"\t\t2- ÖĞRETMEN İŞLEMLERİ\n" +
				"\t\tQ- ÇIKIŞ\n\n" +
				"  \t  SEÇİMİNİZ:");

		char secim = scanner.next().toUpperCase().charAt(0);
		switch (secim) {
			case '1': {
				Ogrenci_Islemleri ogrenciIslemleri = new Ogrenci_Islemleri();
				ogrenciIslemleri.ogrMenu();
				break;

			}
			case '2': {
				Ogretmen_islemleri ogretmenIslemleri = new Ogretmen_islemleri();
				ogretmenIslemleri.ogrtMenu();
				break;
			}
			case 'Q': {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Hatalı Giriş Yaptınız....");
				menu();
			}
		}


	}
}
