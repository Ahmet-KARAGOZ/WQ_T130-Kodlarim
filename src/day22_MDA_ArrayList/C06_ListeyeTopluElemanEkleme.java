package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ListeyeTopluElemanEkleme {
	public static void main(String[] args) {

		/*
		Eğer yeni oluşturduğumuz bir liste toplu olarak eleman eklemek istiyorsak array olarak oluşturup loop ile Liste ekleyebiliriz.
		 */
		int[] arr = {3,5,2,1,5,3,6,8,2,3,4,5};
		List<Integer> sayilar = new ArrayList<>();

		for (int i = 0; i < arr.length ; i++) {
			sayilar.add(arr[i]);
		}
		System.out.println(sayilar);
	}
}
