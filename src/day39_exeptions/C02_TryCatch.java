package day39_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*


		 */
		int sayi1 = 0;
		int sayi2 = 1;

		try {
			System.out.println("Bölünecek tam sayıyı giriniz : ");
			sayi1 = scanner.nextInt();
			System.out.println("Bölecek tam sayıyı giriniz : ");
			sayi2 = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Tam sayı dedik kral !");
		}

		try {
			System.out.println("ilk sayı /  ikinci sayi : " + sayi1 / sayi2);
		} catch (ArithmeticException e) {
			System.out.println("Bölecek sayı 0 olamaz!");
		}


	}
}
