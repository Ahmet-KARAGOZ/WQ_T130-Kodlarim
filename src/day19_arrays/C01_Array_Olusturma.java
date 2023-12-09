package day19_arrays;

import java.util.Arrays;

public class C01_Array_Olusturma {
	public static void main(String[] args) {
		int[] arr2 = {3,4,5};
		System.out.println(arr2[2]);

		arr2[1] = 8;
		System.out.println(Arrays.toString(arr2));

		int[] arr4 = new int[5];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println(Arrays.toString(arr4));
		String[] str1 = new String[10];
		System.out.println(Arrays.toString(str1));
	}
}
