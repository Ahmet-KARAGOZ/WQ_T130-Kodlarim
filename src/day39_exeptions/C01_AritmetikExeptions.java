package day39_exeptions;

import java.util.Scanner;

public class C01_AritmetikExeptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bölünecek tam sayıyı giriniz : ");
		int sayi1 = scanner.nextInt();
		System.out.println("Bölecek tam sayıyı giriniz : ");
		int sayi2 = scanner.nextInt();

		System.out.println("ilk sayı /  ikinci sayi : " + sayi1/sayi2);

	}
}
