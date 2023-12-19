package day42_listiterator_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_Set {
	public static void main(String[] args) {
		// 2 özelliği MUTLAKA BİL
		//1- HER ELEMANDAN SADECE 1 TANE OLABİLİR
		//2- İNDEX DESTEKLEMEZZ.


		int[] arr = {2, 4, 6, 76, 9, 9, 6, 6, 90, 6, 5, 4, 4, 8};
		// verilen arrayi unique elementlerden oluşan tekrarsız array haline getirin.

		Set<Integer> unique = new HashSet<>();

		for (int each : arr) {
			unique.add(each);
		}
		System.out.println("unique = " + unique);

		arr = new int[unique.size()]; // aynı boyutta alsun diye arrayi tekrar tanımladık.
		int index = 0;
		for (Integer each : unique) {
			arr[index] =each;
			index++;

		}
		System.out.println(Arrays.toString(arr));


	}
}
