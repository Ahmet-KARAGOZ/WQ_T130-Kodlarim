package day03_ScannerAndCasting;

import java.util.Scanner;

public class C06_charCasting {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir Karakter giriniz : ");
		char girilenKarakter = scanner.nextLine().charAt(0);
		int girilenAsci = girilenKarakter;

		char ch1 = (char) (girilenAsci + 1);
		char ch2 = (char) (girilenAsci + 2);
		char ch3 = (char) (girilenAsci + 3);

		System.out.println("Sonraki 3 karakter : " + " " + ch1 + " " + ch2 + " " + ch3);

		//Aşağıdaki Şekildede yapabiliriz.
		//char ile matemetiksel işlem yaparsak ASCII kodunu alarak işlem yapar.

		System.out.println("1 Sonraki Karakter : "+ (char)(girilenKarakter+1));
		System.out.println("2 Sonraki Karakter : "+ (char)(girilenKarakter+2));
		System.out.println("3 Sonraki Karakter : "+ (char)(girilenKarakter+3));


	}
}
