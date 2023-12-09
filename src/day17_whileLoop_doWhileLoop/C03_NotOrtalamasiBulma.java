package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {
	public static void main(String[] args) {

		//Negatif say girine kadar girilen notların sayısını ve ortalamasını hesaplayını ve yüksek notu yazdırın.
		Scanner scanner = new Scanner(System.in);

		double toplam =0;
		int sayac =0;
		double enYuksekNot = 0;
		double not = 0;

		while (not>=0){
			System.out.println("İşelmi bitirmek için negatif not giriniz !!!");
			System.out.print("Notunuzu Giriniz : ");
			not = scanner.nextDouble();
			if (not>=0){
				toplam+=not;
				sayac++;
				if (not>enYuksekNot) enYuksekNot=not;
			}

		}

		System.out.println("Girilen not sayısı = " + sayac);
		System.out.println("Not ortalaması : "+ (toplam/sayac));
		System.out.println("En yüksek not = " + enYuksekNot);
	}
}
