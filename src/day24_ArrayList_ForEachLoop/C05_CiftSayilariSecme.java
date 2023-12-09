package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {
	public static void main(String[] args) {

		 /*
            istenen elementleri bir array olarak istedigi icin
            iki sekilde yapabiliriz

            1- once kactane cift sayi oldugunu bulur
               sayiya gore bir array olusturup
               cift sayilari olusturulan yeni array'e kopyalariz

            2- arraydeki tum elementleri gozden gecirip
               cift olanlari bir listeye atariz
               listenin uzunluguna gore yeni array olusturup
               listedeki elementleri yeni array'e kopyalariz
         */

		// arraydeki tum elementleri gozden gecirip
		// cift olanlari bir listeye atariz
		int[] arr = {3, 5, 1, 7, 9, 0, 4, 2, 6, 7, 8, 1, 5, 8, 7, 6};
		List<Integer> ciftSayilarListesi = new ArrayList<>();

		for (int i : arr) {
			if (i % 2 == 0) {
				ciftSayilarListesi.add(i);
			}
		}

		int[] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];

		for (int i = 0; i < ciftSayilarListesi.size(); i++) {
			ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);
		}

		System.out.println("Çift Sayilar Arrayi = " + Arrays.toString(ciftSayilarArrayi));

		/*
		FOREACH LOOP A İNDEX DEĞİŞKENİ EKELYEREKTE YAPABİLİRZ.
		 int index = 0;
        for (int each : ciftSayilarListesi
             ) {
            ciftSayilarArrayi[index] = ciftSayilarListesi.get(index);
            index++;
        }


		 */
	}
}
