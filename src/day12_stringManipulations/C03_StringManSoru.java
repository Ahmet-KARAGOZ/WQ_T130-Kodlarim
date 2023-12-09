package day12_stringManipulations;

import java.util.Scanner;

public class C03_StringManSoru {
	public static void main(String[] args) {

		/*
		Soru 2 : 	Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
 					input1 : “15.30 €” , input2 : “11.40 €”
 					output : 26.70 €

 		Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
					  - ilk harf kucuk harf olmali
					  - son karakter rakam olmali
					  - sifre bosluk icermemeli
					  - uzunlugu en az 10 karakter olmali

	   Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
				     - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
				     - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

		Soru 6 : Kullanicidan alinan bir String alin,
				String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
				String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

		Soru 7 :    kullanicidan isim, soyisim ve kredi karti numarasini alin
				 gorunurIsim olarak A****** N****** seklinde
				 sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
				 gorunur kart no : **** **** **** 1234 olsun

		 */


		//SORU-6 ÇÖZÜMÜ
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir metin giriniz : ");
		String metin = scanner.nextLine();
		int orta = (metin.length()/2)+1;

		if (metin.length()%2==0){
			System.out.println(metin.substring(0,(metin.length()/2))+":)"+metin.substring(metin.length()/2));
		} else {
			System.out.println(metin.substring(0,metin.length()/2)+":("+metin.substring((metin.length()+1)/2));
		}


	}
}
