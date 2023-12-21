package day44_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_FarkliDataTurlerindekiElementleriKullanma {
	public static void main(String[] args) {
		List<Object> seyler = new ArrayList<>();
		int[] arr = {4, 5, 6};

		seyler.add("Sedat");
		seyler.add(10);
		seyler.add(false);
		seyler.add('K');
		seyler.add(arr);

		System.out.println("seyler = " + seyler);

		System.out.println((Integer) seyler.get(1) * 2);

		System.out.println(seyler.get(0).toString().toUpperCase());
		System.out.println(((String) seyler.get(0)).toUpperCase());



		System.out.println(Arrays.toString((int[]) seyler.get(4)));

	}
}
