package day06_IfStatements;

import java.util.Scanner;

public class C03_iftatements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üçgen kenar uzunluklarını Giriniz: ");

		int kenar1 = scanner.nextInt();
		int kenar2 = scanner.nextInt();
		int kenar3 = scanner.nextInt();

		boolean flag = true;

		if ((kenar1 == kenar2) & (kenar1 == kenar3) & (kenar2 == kenar3)) {
			System.out.println("Eşkenar üçgen");
			flag = false;
		}
		if ((kenar1 == kenar2 & kenar3 > 0) & flag) {
			System.out.println("ikizkenar üçgen");
		}
		if ((kenar1 == kenar3 & kenar2 > 0) & flag) {
			System.out.println("ikizkenar üçgen");
		}
		if ((kenar2 == kenar3 & kenar1 > 0) & flag) {
			System.out.println("ikizkenar üçgen");
		}


		if ((kenar1 != kenar2) & (kenar1 != kenar3) & (kenar2 != kenar3)) {
			System.out.println("Çokkenar üçgen");


		}

		System.out.println('a'<'c');


	}
}
