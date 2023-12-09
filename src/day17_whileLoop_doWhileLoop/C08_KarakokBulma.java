package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C08_KarakokBulma {
	public static void main(String[] args) {
		/*
		Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz, tamkare ise true değilse false yazdırınız.
				Ornek : input : 16, output: 4
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Karakokunu bulmak istediğiniz sayıyı giriniz : ");
		int sayi = scanner.nextInt();

		int karakokKontrol = 1;
		int flag = 10;

		for (int i = 1; i*i <= sayi ; i++) {
			if (i*i==sayi){
				flag++;
				break;
			}
		}
		if (flag==10){
			System.out.println(false);
		} else System.out.println(true);

		//do while ile
		karakokKontrol=1;
		flag=10;

		do {
			if (karakokKontrol*karakokKontrol==sayi){
				flag++;
				break;
			}
			karakokKontrol++;
		}while (karakokKontrol*karakokKontrol<=sayi);

		if (flag==10){
			System.out.println(false);
		} else System.out.println(true);
	}
}
