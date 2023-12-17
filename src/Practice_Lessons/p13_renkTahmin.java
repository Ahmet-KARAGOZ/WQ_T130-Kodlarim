package Practice_Lessons;

import java.util.ArrayList;
import java.util.Scanner;

public class p13_renkTahmin {
	public static void main(String[] args) {
		// Bir ArrayList oluşturun ve içine 3 adet renk ekleyin.
		// Daha sonra kullanıcıdan bir renk adı alın ve bu rengin ArrayList'te olup olmadığını ekrana yazdırın.

		ArrayList<String> colors = new ArrayList<>();
		colors.add("purple");
		colors.add("yellow");
		colors.add("blue");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir renk adı giriniz : ");
		String data = scanner.nextLine();
		String searchingColor = data.toLowerCase();

		if (colors.contains(searchingColor)){
			System.out.println("Aranan renk bulundu :)");
		} else {
			System.out.println("Aranan renk kayıtlarımızda yoktur.");
		}

	}
}
