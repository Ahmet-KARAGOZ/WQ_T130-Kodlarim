package day20_aarrays2;

import java.util.Arrays;

public class C07_BinarySearch {
	public static void main(String[] args) {
		int[] arr = {3, 9, 1, 17, 5, 2, 20};
		System.out.println(Arrays.binarySearch(arr,2));
		System.out.println(Arrays.binarySearch(arr,20));

		//BinarySearch Kullnmadan önce dizinin sıralanması gereklidir yosa sonuçlar hatalı çıkacaktır.

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,1));
		System.out.println(Arrays.binarySearch(arr,3));
		System.out.println(Arrays.binarySearch(arr,1453));
		System.out.println(Arrays.binarySearch(arr,0));
	}
}
