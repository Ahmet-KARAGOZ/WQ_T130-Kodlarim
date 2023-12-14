package day39_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_CokluTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		Tek try tüm riskleri kapsayan Exception kullanımı:
		 */
		int sayi1 = 0;
		int sayi2 = 1;

		try {
			System.out.println("Bölünecek tam sayıyı giriniz : ");
			sayi1 = scanner.nextInt();
			System.out.println("Bölecek tam sayıyı giriniz : ");
			sayi2 = scanner.nextInt();
			System.out.println("ilk sayı /  ikinci sayi : " + sayi1/sayi2);
		} catch (Exception e) {
			System.out.println("Giirilen değerler kabul edilemez");
		}
	}
}
