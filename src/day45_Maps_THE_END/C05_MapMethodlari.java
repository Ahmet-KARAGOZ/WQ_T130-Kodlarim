package day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C05_MapMethodlari {
	public static void main(String[] args) {
		Map<String,Integer> harfler = new HashMap<>();

		harfler.put("K",20);
		harfler.put("B",30);
		harfler.put("C",50);
		harfler.put("Z",80);

		harfler.putIfAbsent("B",20);
		System.out.println("harfler = " + harfler);

		System.out.println(harfler.getOrDefault("B", 0));

		harfler.replace("B",40);
		System.out.println("harfler = " + harfler); //harfler = {B=40, C=50, Z=80, K=20}

		harfler.replace("B",40,50);
		System.out.println("harfler = " + harfler); //harfler = {B=50, C=50, Z=80, K=20}

		harfler.replace("B",60,70);
		System.out.println("harfler = " + harfler); //harfler = {B=50, C=50, Z=80, K=20}


	}
}
