package day20_aarrays2;

import java.util.Arrays;

public class C06_sort {
	public static void main(String[] args) {
		String[] isimler = {"Seher","Selin","sedat","Saido","Ali"};
		System.out.println(Arrays.toString(isimler));

		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));


		int[] arr = {5,6,2,69,1469,32,-6,1223};
		Arrays.sort(arr);
		System.out.println("En küçük sayi : "+ arr[0]);
		System.out.println("En büyük sayi : "+ arr[arr.length-1]);
	}
}
