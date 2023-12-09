package day20_aarrays2;

import day19_arrays.C02_ArrayinElemanlariniArtirma;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaArraysOlustturtma {
	public static void main(String[] args) {
		/*
		Soru 5- Kullanicidan array’in boyutunu ve tam sayı elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
		 */

		int [] benimArray = arrayOlustur();
		//System.out.println(Arrays.toString(benimArray));
//
		//System.out.println("Direk sout ile yazdırmak için kullanımı !");
		//System.out.println(Arrays.toString(arrayOlustur()));

		benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArttir(benimArray,4);
		System.out.println("Arttırıımış : "+ Arrays.toString(benimArray));
	}

	public static int[] arrayOlustur(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç elemanlı Array istiyorsunuz : ");
		int elemanSayisi = scanner.nextInt();

		int[] arr = new int[elemanSayisi];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Arraya eklemek için tam sayı giriniz : ");
			arr[i] = scanner.nextInt();


		}
		return arr;
	}
}
