package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachListedekiSayilariTopalam {
	public static void main(String[] args) {

		/*
            For-each loop
            birden cok elemnt barindiran yapilar icin kullanilir

            For-each loop'un gorevi
            verdigimiz cok eleman barindiran yapidaki
            TUM ELEMENTLERI bize getirmektir

            Bu islem icin for-each loop'a 3 bilgi gereklidir
            1- Bize getirecegi elementlerin data turu
            2- Loop icinde bu elementlere verecegimiz isim (bizim oglanin adi)
            3- bu elementleri nereden alip bize getirecegi

            for-each loop index kullanmadigi icin
            elementleri sirali getirme mecburiyeti yoktur
            genellikle sirali getirir, ama sirali getirecegi varsayilarak islem YAPILAMAZ
         */

		Integer[] arr = {3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6};
		List<Integer> sayilar = new ArrayList<>();

		// Index kullanmadan arr yi sayilar listesine ekleyiniz.

		for (int i : arr) {
			sayilar.add(i);
		}
		System.out.println("sayilar = " + sayilar);

		int toplam =0;
		for (int i:sayilar ) {
			toplam+=i;
		}
		System.out.println("Toplam = " + toplam);
	}
}
