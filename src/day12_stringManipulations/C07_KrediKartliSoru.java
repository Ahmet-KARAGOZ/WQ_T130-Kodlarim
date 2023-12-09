package day12_stringManipulations;

import java.util.Scanner;

public class C07_KrediKartliSoru {
	public static void main(String[] args) {
		/*
		Soru 7 :    kullanicidan isim, soyisim ve kredi karti numarasini alin
				 gorunurIsim olarak A****** N****** seklinde
				 sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
				 gorunur kart no : **** **** **** 1234 olsun
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("İsminizi Giriniz: ");
		String isim = scanner.nextLine();

		System.out.println("Soyisim giriniz : ");
		String soyIsim = scanner.nextLine();

		System.out.println("Kredi Kartı Numarınız Giriniz : ");
		String kkNo = scanner.nextLine();

		System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*")
							+" "+
								soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*"));

		System.out.println("**** **** **** "+kkNo.substring(kkNo.length()-4));

	}
}
