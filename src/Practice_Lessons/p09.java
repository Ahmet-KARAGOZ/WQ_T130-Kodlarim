package Practice_Lessons;

import java.util.Scanner;

public class p09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen pozitif bir değer girin");
		int sayi = scanner.nextInt();
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				System.out.print("asal sayı değildir");
				break;
			} else  {
				System.out.print("sayıASAL");
				break;
			}
		}
	}
}
