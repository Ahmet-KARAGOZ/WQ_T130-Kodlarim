package day21_arrays_MultiDimensionalArrays;

import day20_aarrays2.C04_ArrayeElementEkleme;

import java.util.Arrays;

public class C03_ArrayeYeniDegerAtama {
	public static void main(String[] args) {
		int[] arr1 = {3,5,7};

		//arr1 = {4,6,8}; Bu şekilde direk değerleri atayamayız.

		//1. Yöntem
		// Arrraye sadece Array ataması yapabiliriz. Bunun için de önce geçici bir array oluşturmamız lazım.

		int[] gecicArray = {4,6,8};
		arr1 = gecicArray;
		System.out.println(Arrays.toString(arr1));

		//2. Yöntem ise
		//  Sadece Default değerlerden oluşan bi Arrayi atayabiliriz

		arr1 = new int[5]; // Aslında arrayi yeniden tanımlıyoruz.
		System.out.println(Arrays.toString(arr1)); //[0, 0, 0, 0, 0]

		int[] sayilar = {1,4,8};
		sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar,3);
		sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar,9);
		System.out.println(Arrays.toString(sayilar)); //[1, 4, 8, 3, 9]

		int[] a1= {1,2,3};
		int[] a2= {8,1,2,3};

		// Arraye farklı uzunlukta başka bir array atayabiliriz.
		a1=a2;
		System.out.println(Arrays.toString(a1));

		// Bir Arrayden ilk elementini silme
		System.out.println(Arrays.toString(sayilar)); // sayilar Arrayi [1, 4, 8, 3, 9]

		int[] yeniSayilar = new int[sayilar.length-1];

		for (int i = 0; i < yeniSayilar.length ; i++) {
			yeniSayilar[i] = sayilar[i+1];
		}
		sayilar=yeniSayilar;

		System.out.println(Arrays.toString(sayilar));








	}
}
