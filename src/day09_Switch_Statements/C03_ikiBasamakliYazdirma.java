package day09_Switch_Statements;

import java.util.Scanner;

public class C03_ikiBasamakliYazdirma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İki Basamaklı Bir Sayı Giriniz : ");
		int sayi = scanner.nextInt();

		int birlerBasamagi = sayi % 10;
		int onlarbasamagi = sayi / 10;

		switch (onlarbasamagi){
			case 1:
				System.out.print("on");
				break;
			case 2:
				System.out.print("yirmi");
				break;
			case 3:
				System.out.print("otuz");
				break;
			case 4:
				System.out.print("kırk");
				break;
			case 5:
				System.out.print("elli");
				break;
			case 6:
				System.out.print("altmış");
				break;
			case 7:
				System.out.print("yetmiş");
				break;
			case 8:
				System.out.print("seksen");
				break;
			case 9:
				System.out.print("doksan");
				break;


		}

		switch (birlerBasamagi){
			case 1:
				System.out.println("bir");
				break;
			case 2:
				System.out.println("iki");
				break;
			case 3:
				System.out.println("üç");
				break;
			case 4:
				System.out.println("dört");
				break;
			case 5:
				System.out.println("beş");
				break;
			case 6:
				System.out.println("altı");
				break;
			case 7:
				System.out.println("yedi");
				break;
			case 8:
				System.out.println("sekiz");
				break;
			case 9:
				System.out.println("dokuz");
				break;
			case 0:
				
				break;


		}
	}
}
