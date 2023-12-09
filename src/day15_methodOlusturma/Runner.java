package day15_methodOlusturma;

import day16_methodOlusturma_metohdOverLoading.C01_voidMetohdOlusturma;

public class Runner {
	public static void main(String[] args) {
		C02_AsalSayiMetodu.asalsayimi(61);
		C02_AsalSayiMetodu.asalsayimi(83);
		C02_AsalSayiMetodu.asalsayimi(12);

		System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(234564));
		System.out.println(C03_TamBolenlerSayisi.pozitifTamBolenSayisi(61));

		C01_voidMetohdOlusturma.kisiBilgileriYazdir("Yakup","TERELELLI","5698756321457896");


	}
}
