package day16_methodOlusturma_metohdOverLoading;

import java.util.Scanner;

public class C03_metniTersineCevirme {
	public static void main(String[] args) {

		/*
		Verilen metni tersine cevirip bize döndüren bize döndüren bir method oluşturun.
		Kullaıcıdan kelime alıp palindrom olup olmadığına bakınız.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir keilme giriniz : ");
		String str = scanner.nextLine();

		if (str.equalsIgnoreCase(metniTerseCevir(str))){
			System.out.println("Bu bir polindromdur");
		} else System.out.println("Polindrom değildir.");




	}

	public static String metniTerseCevir(String metin){
		String tersMetin = "";
		for (int i = metin.length()-1; i >=0 ; i--) {
			tersMetin+=metin.substring(i,i+1);
		}

		return tersMetin;
	}
}
