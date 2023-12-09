package day17_whileLoop_doWhileLoop;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class C01_WhileLoop {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Başlangıç sayısını giriniz : ");
		int baslangic = scanner.nextInt();
		System.out.print("Bitiş sayısını giriniz : ");
		int bitis = scanner.nextInt();

		int toplam =0;

		int sayi = baslangic;

		while (sayi<=bitis){
			toplam+=sayi;
			sayi++;
		}
		System.out.println("toplam = " + toplam);

	}
}
