package day14_ForLoopExamples;

import java.util.Scanner;

public class C08_NestedForLoop {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satır sayısını giriniz: ");
		int satir = scanner.nextInt();

		for (int i = 1; i <=satir ; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			Thread.sleep(500);
		}

		for (int i = satir; i >=1 ; i--) {
			for (int j = i; j >=1 ; j--) {
				System.out.print("* ");
			}
			System.out.println("");
			Thread.sleep(500);
		}


	}
}
