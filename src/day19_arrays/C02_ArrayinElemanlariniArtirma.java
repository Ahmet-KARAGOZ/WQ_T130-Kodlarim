package day19_arrays;

import java.util.Arrays;

public class C02_ArrayinElemanlariniArtirma {
	public static void main(String[] args) {
		int [] arr={5,1,7,9,2};
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=2;
		}
		System.out.println(Arrays.toString(arr));

		arr = elemanlariArttir(arr,3);
		System.out.println(Arrays.toString(arr));

		arr = elemanlariArttir(arr,5);
		System.out.println(Arrays.toString(arr));


	}

	public static int[] elemanlariArttir(int[] arr, int artisMiktari){
		for (int i = 0; i < arr.length; i++) {
			arr[i]= arr[i]+artisMiktari;
		}
		return arr;
	}
}
