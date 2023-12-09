package Practice_Lessons;

import java.util.Scanner;

public class p05_findChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz : ");
		char harf = scanner.next().charAt(0);

		//int hedef = harf+3;
		//System.out.println("Girilen harf sonrası 3. Harf : "+(char)hedef);

		System.out.println("Girilen harf sonrası 3. Harf : " + (char) (harf + 3));

		
	}
}
