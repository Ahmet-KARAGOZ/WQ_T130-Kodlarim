package day03_ScannerAndCasting;

import java.util.Scanner;

public class C07_DataCasting2 {
	public static void main(String[] args) {

		int sayi1 = 20;
		int sayi2 = 3;
		System.out.println(sayi1 / sayi2);

		double sayi3 = 3;
		System.out.println(sayi1 / sayi3);

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Tam Sayı: ");
		int sy1 = scanner.nextInt();

		System.out.println("2.Tam Sayı: ");
		int sy2 = scanner.nextInt();

		System.out.println(sy1/sy2);
		System.out.println((double)(sy1/sy2));
		System.out.println((double) (sy1) / (double) (sy2));



	}
}
