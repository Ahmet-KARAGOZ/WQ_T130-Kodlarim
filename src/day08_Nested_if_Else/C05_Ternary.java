package day08_Nested_if_Else;

import java.util.Scanner;

public class C05_Ternary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üçgen Kenar Uzunluklarını Giriniz :");
		int kenar1 = scanner.nextInt();
		int kenar2 = scanner.nextInt();
		int kenar3 = scanner.nextInt();

		System.out.println(kenar1 == kenar2 ? kenar1 == kenar3 ? "Eşkenar" : "Eşkenar Değil" : "Eşkenar Değil");
		System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ? "Eşkenar" : "Eşkenar Değil");


	}
}
