package day21_arrays_MultiDimensionalArrays;

public class C02_StringSplitMethodu {
	public static void main(String[] args) {
		//Verilen metinde istenen karakteerin kaç kere kullanıldığını yazdırın.

		String metin = "Java da hergun yeni seyler ogreniyoruz.";
		String arananKarakter = "e";

		String[] karakteerler = metin.split("");
		int sayac = 0;

		for (int i = 0; i < karakteerler.length; i++) {
			if (karakteerler[i].equals(arananKarakter)) {
				sayac++;
			}
		}
		System.out.println("Aradıgınız karakter metinde " + sayac + " defa kullanılmıştır");

		sayac = 0;
		for (String i : karakteerler) {
			if (i.equals(arananKarakter)) {
				sayac++;
			}
		}
		System.out.println("forEach ile aranan karakter sayısı " + sayac);
	}
}
