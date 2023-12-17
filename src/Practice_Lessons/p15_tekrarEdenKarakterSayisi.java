package Practice_Lessons;

import javax.swing.*;

public class p15_tekrarEdenKarakterSayisi {
	public static void main(String[] args) {
		//Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz

		String input = JOptionPane.showInputDialog("Lütfen bir cümke yazınız : ");
		System.out.println("input = " + input);

		String[] arr = input.split("");
		int counter = 0;
		char encokHarf = ' ';
		int enCok = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i].contains(arr[j])) {
					counter++;
				}
			}
			if (counter > enCok) {
				enCok = counter;
				encokHarf = arr[i].charAt(0);
			}
			counter = 0;

		}

		System.out.println(encokHarf + " karakteri "+ enCok+" kez geçmiştir.");
		System.out.println(Integer.toBinaryString(83));


	}
}
