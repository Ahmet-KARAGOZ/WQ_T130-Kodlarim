package day13_For_Loop;

import java.util.Scanner;

public class C06_Faktoriyel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("20 ten küçük bir sayı giriniz : ");
		int sayi = scanner.nextInt();

		long faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
			System.out.println("faktoriyel = "+ i+" " + faktoriyel);
		}
		System.out.println("faktoriyel = "+ + faktoriyel);


	}
}
