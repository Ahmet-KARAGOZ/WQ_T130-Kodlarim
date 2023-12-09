package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
	public static void main(String[] args) {

		//Verilen not 0-100 arasında mı

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı Giriniz : ");
		int sayi = scanner.nextInt();

		boolean sonuç = sayi >= 0 & sayi <= 100;
		System.out.println("Sayi 0-100 arasında mı : " + sonuç);
	}
}
