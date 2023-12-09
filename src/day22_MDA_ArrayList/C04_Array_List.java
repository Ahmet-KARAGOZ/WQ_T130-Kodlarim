package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Array_List {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(7);
		sayilar.add(2);
		sayilar.add(9);
		System.out.println(sayilar); //[7, 2, 9]

		sayilar.add(1,5);
		System.out.println(sayilar); //[7, 5, 2, 9]

		System.out.println(sayilar.contains(3)); //false
		System.out.println(sayilar.contains(5)); //true




	}
}
