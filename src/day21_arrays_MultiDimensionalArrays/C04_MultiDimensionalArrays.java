package day21_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][] arr = {{3,4,5},{9,10},{7},{1,2,3,4,5,6}};
		System.out.println(arr[2][0]); //7
		System.out.println(Arrays.toString(arr[0]));//[3, 4, 5]
		System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 10], [7], [1, 2, 3, 4, 5, 6]]

		int[] arrYedek = {11,12};
		arr[1]=arrYedek;
		System.out.println(Arrays.deepToString(arr));


	}
}
