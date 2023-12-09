package day21_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_TumElementleriArttirma {
	public static void main(String[] args) {
		int[][] arrIki = {{3, 4, 6}, {9, 0}, {2, 5, 6, 8, 1}};




		for (int i = 0; i < arrIki.length; i++) {
			for (int j = 0; j < arrIki[i].length; j++) {
				arrIki[i][j] += 3;
			}
		}
		System.out.println(Arrays.deepToString(arrIki));
	}
}
