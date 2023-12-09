package day20_aarrays2;

import java.util.Arrays;

public class C03_elemanlariSagaKaydirma {
	public static void main(String[] args) {
		/*
		Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
 				Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
		 */

		int[] sayilar = {1, 2, 3, 4, 5};

		int yedekleme = sayilar[sayilar.length - 1];

		for (int i = (sayilar.length - 1); i >= 1; i--) {
			sayilar[i] = sayilar[i - 1];

		}
		sayilar[0] = yedekleme;
		System.out.println(Arrays.toString(sayilar));

		int[] sayilar2 = {3,0,2};
		sayilar2 = elementlerSagaKaydir(sayilar2);
		System.out.println("Method ile : "+Arrays.toString(sayilar2));
	}

	public static int[] elementlerSagaKaydir(int[] arr){
		int temp = arr[arr.length-1];
		for (int i = (arr.length - 1); i >= 1; i--) {
			arr[i] = arr[i - 1];

		}
		arr[0]=temp;
		return arr;
	}
}
