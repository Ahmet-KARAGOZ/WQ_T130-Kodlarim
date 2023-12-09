package Practice_Lessons;

import java.util.Scanner;

public class p01 {
	public static void main(String[] args) {  // Method Signature
		System.err.println("Kırmızı Yazmak için Kullanılır.");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kenar uzunluklarını Giriniz: ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println("Dikdörtgen Alanı : " + (a * b));
	}
}
