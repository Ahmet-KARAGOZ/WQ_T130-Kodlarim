package day14_ForLoopExamples;

import java.util.Scanner;

public class C03_StringTerstenYazdirma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir metin giriniz : ");
		String metin = scanner.nextLine();

		for (int i = metin.length()-1; i >=0 ; i--) {
			System.out.print(metin.charAt(i));
		}
	}
}
