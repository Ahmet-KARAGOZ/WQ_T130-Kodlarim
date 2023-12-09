package Practice_Lessons;

import java.util.Scanner;

public class p07_Ebob_ekok {
	public static void main(String[] args) {
		/*
		Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("1. Sayiyi giriniz : ");
		int sayi1 = scanner.nextInt();

		System.out.print("2. Sayiyi giriniz : ");
		int sayi2 = scanner.nextInt();
		int ebob=1;


		System.out.println("Girilen sayıların EBOB degeri : "+ ebob);
		//System.out.println("Girilen sayıların EKOK degeri : "+ ekok);

		System.out.println("EBOB Metod sonucu : "+ebobHesaplama(sayi1,sayi2));
		ekokHesaplama(sayi1,sayi2);

	}

	public static int ebobHesaplama(int a, int b){
		int buyukSayi;
		int kucukSayi;
		int ebob=1;


		if (a > b) {
			buyukSayi = a;
			kucukSayi = b;
		} else {
			buyukSayi = b;
			kucukSayi = a;
		}

		for (int i = kucukSayi; i > 0; i--) {
			if (kucukSayi % i == 0 && buyukSayi % i == 0) {
				ebob = i;
				break;
			}
		}
		return ebob;
	}
	public static void ekokHesaplama(int a, int b){
		int ekok=1;
		int buyukSayi;
		int kucukSayi;



		if (a > b) {
			buyukSayi = a;
			kucukSayi = b;
		} else {
			buyukSayi = b;
			kucukSayi = a;
		}



		for (int i = buyukSayi; i <= buyukSayi * kucukSayi; i += buyukSayi) {
			if (i % kucukSayi == 0 && (i & buyukSayi) == 0){
				ekok=i;
				System.out.println("Metod EKOK degeri : "+ ekok);
				break;
			}
		}
	}
}
