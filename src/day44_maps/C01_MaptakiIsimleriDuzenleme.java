package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MaptakiIsimleriDuzenleme {
	public static void main(String[] args) {
		//4- Ogrenci Map'indeki tum isimleri ilk harf buyuk sonraki harfler kucuk, tum soyisimleri ile tamamen buyuk harf yapin

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

		Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
		for (Integer eachKey : ogrenciKeySet) {
			String ogrenciValue = ogrenciMap.get(eachKey);
			String[] ogrenciValueArr = ogrenciValue.split("-");

			ogrenciValueArr[0] = ogrenciValueArr[0].substring(0, 1).toUpperCase() + ogrenciValueArr[0].substring(1).toLowerCase();

			ogrenciValueArr[1] = ogrenciValueArr[1].toUpperCase();

			String yeniValue = ogrenciValueArr[0] + "-" + ogrenciValueArr[1] + "-" + ogrenciValueArr[2] + "-" + ogrenciValueArr[3] + "-" + ogrenciValueArr[4];

			ogrenciMap.put(eachKey,yeniValue);
		}

		System.out.println("ogrenciMap = " + ogrenciMap);

	}
}
