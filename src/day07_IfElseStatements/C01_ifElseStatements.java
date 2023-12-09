package day07_IfElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Tam Sayı Giriniz : ");
		int sayi = scanner.nextInt();

		if (sayi%3==0 & sayi%5==0){
			System.out.println("Süper Sayı");
		} else if (sayi%3==0) {
			System.out.println("3'e Bölünebilen Sayı");
		} else if (sayi%5==0) {
			System.out.println("5' e Bölünebilen Sayi");
		} else {
			System.out.println("3 veya 5 e bölünemeyen sayı");
		}
	}
}
