package day21_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethodu {
	public static void main(String[] args) {
		String str = "Java gun gectikce guzellesiyor";

		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(str.split("e")));
		System.out.println(Arrays.toString(str.split("gec")));
		/*
		Verilen bir aramada sonucun 1000 den fazla olduğunu test edin

		 */
		String aramaSonucu = "1-48 of over 700 results for java";
		String[] kelimeler = aramaSonucu.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		String aramaSonucSayisiStr = kelimeler[3];
		aramaSonucSayisiStr = aramaSonucSayisiStr.replaceAll("\\D","");
		System.out.println("aramaSonucSayisiStr = " + aramaSonucSayisiStr);

		int aramaSonucSayisi = Integer.parseInt(aramaSonucSayisiStr);
		if (aramaSonucSayisi>1000) System.out.println("Arama sonuç sayısı passed");
		else System.out.println("Test Failed!");
	}
}
