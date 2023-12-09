package day04_WrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {
	public static void main(String[] args) {

		System.out.println(25 % 8);
		System.out.println(834569876 % 8);
		System.out.println(76256513 % 113);

		//Kullanıcıdan alınan sayının birler basamağını yazdırınız.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println("Birler Basamağı : " + (sayi % 10));


	}
}
