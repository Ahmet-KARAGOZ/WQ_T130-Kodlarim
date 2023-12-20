package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {
	public static void main(String[] args) {
		Map<Integer, String> ogrenciMap = new HashMap<>();

		/*
		Eklemek için put(key, value)
		get(value) ile bilgileri String olarak çekeriz çekeriz.
		Split ile value değerlerini arraye atarız.
		Array de istediğimizi çekeriz.
		 */
		ogrenciMap.put(101,"Ali-Can-10-K-MF");

		String value101 = ogrenciMap.get(101);
		System.out.println("value101 = " + value101);

		String[] ogrenci101Bilgiler = value101.split("-");
		System.out.println(Arrays.toString(ogrenci101Bilgiler));

		System.out.println("101 numara soyismi : "+ ogrenci101Bilgiler[1]);

		System.out.println("101 Bölümü : "+ ogrenci101Bilgiler[4]);

		System.out.println("101 isim soyisim : "+ogrenci101Bilgiler[0]+" "+ogrenci101Bilgiler[1]);
		System.out.println("101 isim soyisim : "+ogrenci101Bilgiler[0]+" "+ogrenci101Bilgiler[1].toUpperCase());




	}
}
