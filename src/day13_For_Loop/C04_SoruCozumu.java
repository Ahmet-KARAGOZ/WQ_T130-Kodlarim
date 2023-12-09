package day13_For_Loop;

import java.util.Scanner;

public class C04_SoruCozumu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir tam sayı giriniz : ");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= sayi; i++) {

			if (i%7==0){
				System.out.print(" " + i);
			}
		}
	}
}
