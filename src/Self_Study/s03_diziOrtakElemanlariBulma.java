package Self_Study;

import day20_aarrays2.C04_ArrayeElementEkleme;

import java.util.Arrays;

public class s03_diziOrtakElemanlariBulma {
	public static void main(String[] args) {
		/*
		Verilen iki adet dizinin ortak elemanlarını yeni bir dizi olarak döndüren methodu yazınız.
		 */
		int[] a = {1, 2, 3, 4, 4, 5, 6, 10, 23, 11, 67, 0};
		int[] b = {4, 5, 6, 7, 9, 10, 12, 23, 0, 7};
		// [4, 5, 6, 10, 23, 0]

		int[] c = {1,2};
		int[] d = {3,4};



		System.out.println(Arrays.toString(arrayKesisim(a, b)));
		System.out.println(Arrays.toString(arrayKesisim(c, d)));
	}

	public static int[] arrayKesisim(int[] arr1, int[] arr2) {
		int[] ortaklar = new int[0];

		for (int i = 0; i < arr1.length; i++) {
			int varMi = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int k = 0; k < ortaklar.length; k++) {
						if (ortaklar[k] == arr1[i]) varMi = 1;
					}
					if (varMi == 0) {
						ortaklar = C04_ArrayeElementEkleme.arrayElementEkle(ortaklar, arr1[i]);
					}
				}
			}
		}
		if (ortaklar.length==0) System.out.println("Ortak eleman Bulunamadı.");
		return ortaklar;
	}
}
