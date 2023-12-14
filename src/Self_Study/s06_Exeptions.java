package Self_Study;

import java.util.Scanner;

public class s06_Exeptions {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		sayilariAl();
	}

	public static int bol(int a, int b){
		int sonuc = a/b;
		return sonuc;
	}
	public static void sayilariAl(){
		try {
			scanner = new Scanner(System.in);
			System.out.print("İki sayı Giriniz : ");
			int sayi1 = scanner.nextInt();
			int sayi2 = scanner.nextInt();
			System.out.println(bol(sayi1,sayi2));
		} catch (Exception e) {
			System.out.println("Düzgün girin...");
			sayilariAl();
		}

	}
}
