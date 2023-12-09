package Self_Study;

import java.util.Arrays;

public class s01_ArayBirlestirmeMethod {
	public static void main(String[] args) {

		/*
		Implement a Java function that takes two arrays and returns a new array containing their common elements.
		 */

		//Verilen iki adet Integer diziyi birleştirerek yeni bir dizi olarak döndüren methodu yazınız.
		int[] a = {1, 2, 3, 4};
		int[] b = {5, 6, 7, 8, 9};
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]


		System.out.println(Arrays.toString(arrayleriEkle(a, b)));

	}

	public static int[] arrayleriEkle(int[] arr1, int[] arr2) {
		int[] sonArray = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			sonArray[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sonArray[i + arr1.length] = arr2[i];
		}
		return sonArray;
	}
}
