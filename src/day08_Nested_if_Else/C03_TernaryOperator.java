package day08_Nested_if_Else;

import java.util.Scanner;

public class C03_TernaryOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz: ");

		int a = scanner.nextInt();

		//a = a > 0 ? a * 2 : a + 10;
		//System.out.println(a);

		System.out.println(a > 0 ? "Pozitif" : "Negatif");

		System.out.println(a < 0 ? a * 2 : "Ohannas");
	}
}
