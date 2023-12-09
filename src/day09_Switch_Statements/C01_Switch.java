package day09_Switch_Statements;

import java.util.Scanner;

public class C01_Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ISTQB anlamını merak ettiğiniz harfi giriniz: ");
		char harf = scanner.next().toUpperCase().charAt(0);

		switch (harf) {
			case 'I':
				System.out.println("International");
				break;
			case 'S':
				System.out.println("Software");
				break;
			case 'T':
				System.out.println("Testing");
				break;
			case 'Q':
				System.out.println("Qualification");
				break;
			case 'B':
				System.out.println("Board");
				break;
			default:
				System.out.println("Doğru harfi Giriniz!");


		}
	}
}
