package day08_Nested_if_Else;

import java.util.Scanner;

public class C04_TernaryEx {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz : ");
		double sayi = scanner.nextDouble();

		System.out.println(sayi % 5 == 0 ? "5'e bölünebilir" : "5'e Bölünemez");
	}
}
