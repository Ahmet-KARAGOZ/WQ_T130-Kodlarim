package Practice_Lessons;

import java.util.Scanner;

public class p04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter  giriniz: ");
		char ch = scanner.next().charAt(0);

		if (ch>=65 & ch<=90){
			System.out.println("Büyük harf girdiniz");
		}
		else{
			System.out.println("Küçük harf girdiniz!");
			System.out.println("Harfin Büyük Hali : "+(char)(ch-32));
		}
	}
}
