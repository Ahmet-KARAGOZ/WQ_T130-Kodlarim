package Self_Study;

import java.util.Scanner;

public class s04_parantezKapalimi {
	public static void main(String[] args) {
		/*
		Write a Java function to check if a given string of parentheses is balanced. For example, "((()))" is balanced, but "(()))" is not.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Parantez kontrolu için açık/kapalı parantez serisini giriniz : ");
		String metin = scanner.nextLine();
		int sayacAcik = 0;
		int sayacKapali = 0;
		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i)=='(') sayacAcik++;
			if (metin.charAt(i)==')') sayacKapali++;

		}
		if (sayacAcik==sayacKapali) System.out.println("Parentheses is balanced");
		else System.out.println("Parentheses is UNbalanced");
	}
}
