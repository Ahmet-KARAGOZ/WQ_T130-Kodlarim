package day10_StringManipulations;

import java.util.Scanner;

public class C01_checkMail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mail adresinizi giriniz : ");
		String mail = scanner.nextLine();

		if (!(mail.contains("@"))){
			System.out.println("Geçersfiz Mail");
		}

		if (!(mail.contains("@gmail.com"))){
			System.out.println("Gmail adresi giriniz");
		}

		if (!(mail.endsWith("@gmail.com"))){
			System.out.println("Mailde  yazım hatası var!");
		}


	}
}
