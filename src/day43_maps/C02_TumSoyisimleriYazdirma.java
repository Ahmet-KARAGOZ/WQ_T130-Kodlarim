package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_TumSoyisimleriYazdirma {
	public static void main(String[] args) {
		Map<Integer, String> ogrenciMap = new HashMap<>();
		ogrenciMap.put(101, "Ali-Can-11-H-MF");
		ogrenciMap.put(102, "Veli-Cem-10-K-TM");
		ogrenciMap.put(103, "Ali-Cem-11-K-TM");
		ogrenciMap.put(104, "Ayse-Can-10-H-MF");
		ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
		ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
		ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
		ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
		ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
		ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");


		//106 soyismini yazdırın

		//String value106 = ogrenciMap.get(106);
		//String[] value106Array = value106.split("-");
		//System.out.println("106 Soyismi : " + value106Array[1]);

		//TÜM ÖĞRENCİLERİN SOYİSİMLERİNİ GETİRİN

		Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

		for(Integer eachKey : ogrenciKeySet){
			String valueEach = ogrenciMap.get(eachKey);
			String[] valueEachArr = valueEach.split("-");
			System.out.println(eachKey+" numaralı öğrencinin soyismi "+valueEachArr[1]);
		}

	}
}
