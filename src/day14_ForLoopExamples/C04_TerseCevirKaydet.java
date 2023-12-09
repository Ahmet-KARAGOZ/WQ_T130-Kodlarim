package day14_ForLoopExamples;

import java.util.Scanner;

public class C04_TerseCevirKaydet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir metin giriniz : ");
		String metin = scanner.nextLine();

		String tersMetin = "";

		for (int i = metin.length()-1; i >=0 ; i--) {
			tersMetin+=metin.charAt(i);
		}
		System.out.println(tersMetin);

		if (metin.equalsIgnoreCase(tersMetin)){
			System.out.println("Bu bir palindromdur!");
		} else System.out.println("Bu bir palindrom değildir!");
	}
}
