package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarEdnleriSilme {
	public static void main(String[] args) {
		int[] arr = {3, 6, 1, 4, 7, 3, 9, 4, 2, 3, 6, 1, 4, 3, 5, 3, 1, 4};

		List<Integer> tekrarsizList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsizList.contains(arr[i])) {
				tekrarsizList.add(arr[i]);
			}
		}
		System.out.println(tekrarsizList);

		arr = new int[tekrarsizList.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = tekrarsizList.get(i);

		}
		Arrays.sort(arr);
		System.out.println("Tekrarsız düzünlenmiş Dizimiz : " + Arrays.toString(arr));

	}
}
