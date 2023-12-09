package Practice_Lessons;

import java.util.Scanner;

public class p03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Vize Notu Giriniz : ");
		double vize1 = scanner.nextDouble();

		System.out.println("2. Vize Notu Giriniz : ");
		double vize2 = scanner.nextDouble();

		System.out.println("Final Notunuzu Giriniz: ");
		double finalNotu = scanner.nextDouble();

		double sonuc = (((vize1+vize2)/2) * 0.4) + (finalNotu*0.6);

		System.out.println("Sınıf Notunuz : " +sonuc);



	}
}
