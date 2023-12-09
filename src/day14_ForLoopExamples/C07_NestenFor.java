package day14_ForLoopExamples;

import java.util.Scanner;

public class C07_NestenFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satır sayısını giriniz: ");
		int satir = scanner.nextInt();

		System.out.print("Sutun sayısını giriniz: ");
		int sutun = scanner.nextInt();

		for (int i = 1; i <=satir ; i++) {
			for (int j = 1; j <= sutun; j++) {
				System.out.print(i+j+" ");
				//System.out.print("*");
			}
			System.out.println("");
		}

	}
}
