package day20_aarrays2;

import java.util.Arrays;

public class C04_ArrayeElementEkleme {
	public static void main(String[] args) {
		/*
		Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.
		 */

		int[] arr = {3, 6, 7, 9, 1};
		// Arraya 5 , 7 ve 9 ekleyelim
		arr = arrayElementEkle(arr,5);
		arr = arrayElementEkle(arr,7);
		arr = arrayElementEkle(arr,3);


		System.out.println(Arrays.toString(arr));
	}

	public static int[] arrayElementEkle(int[] arr, int eklenecSayi) {

		int[] yeniArrary = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			yeniArrary[i] = arr[i];
		}
		yeniArrary[yeniArrary.length - 1] = eklenecSayi;
		return yeniArrary;
	}
}
