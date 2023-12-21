package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_MapEntrySetKullanimi {
	public static void main(String[] args) {
		Map<Integer, String> ogrenciMap = new HashMap<>();
		ogrenciMap.put(101, "ali-Can-11-H-MF");
		ogrenciMap.put(102, "Veli-Cem-10-K-TM");
		ogrenciMap.put(103, "Ali-Cem-11-K-TM");
		ogrenciMap.put(104, "Ayse-Can-10-H-MF");
		ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
		ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
		ogrenciMap.put(107, "esra-Han-11-M-SOZ");
		ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
		ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
		ogrenciMap.put(110, "azim-Kayisi-11-K-TM");

		System.out.println(ogrenciMap.keySet());

		System.out.println(ogrenciMap.values());

		System.out.println("ogrenciMap = " + ogrenciMap);

		Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

		System.out.println("ogrenciEntrySeti = " + ogrenciEntrySeti);

		for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){
			String[] aechValueArr = eachEntry.getValue().split("-");

			String mevcutSinif = aechValueArr[2];

			if (mevcutSinif.equals("12") || mevcutSinif.equalsIgnoreCase("Mezun")){
				aechValueArr[2] = "Mezun";
			} else {
				aechValueArr[2] = Integer.parseInt(mevcutSinif)+1+"";
			}
			eachEntry.setValue(aechValueArr[0] + "-" + aechValueArr[1] + "-" + aechValueArr[2] + "-" + aechValueArr[3] + "-" + aechValueArr[4]);

		}
		System.out.println("ogrenciMap = " + ogrenciMap);

	}
}
