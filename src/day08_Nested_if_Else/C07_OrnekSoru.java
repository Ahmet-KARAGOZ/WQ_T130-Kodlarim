package day08_Nested_if_Else;

import java.util.Scanner;

public class C07_OrnekSoru {
	public static void main(String[] args) {
		/*
		Kullanicidan bir sayi alin sayi
		tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
		sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		double sayi = scanner.nextDouble();

		if (sayi == 0) {
			System.out.println("0 Girmeyiniz");
		} else if (sayi % 2 != 0) {
			if (sayi < 0) {
				System.out.println("Negatif  Tek Sayı");
			} else {
				System.out.println("Pozitif Tek Sayı");
			}
		} else {
			if (sayi % 10 == 0){
				System.out.println("sayi 10'nun katıdır.");
			}else {
				System.out.println("Sayı 10'nun katı değildir.");
			}
		}
	}
}
