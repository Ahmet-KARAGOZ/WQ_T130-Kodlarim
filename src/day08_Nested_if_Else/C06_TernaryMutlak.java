package day08_Nested_if_Else;

import java.util.Scanner;

public class C06_TernaryMutlak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı Giriniz : ");
		double sayi = scanner.nextDouble();
		System.out.println(sayi < 0 ? "Sayının Mutlak Değeri " + (sayi * -1) : "Sayının Mutlak Değeri " + sayi);
	}
}
