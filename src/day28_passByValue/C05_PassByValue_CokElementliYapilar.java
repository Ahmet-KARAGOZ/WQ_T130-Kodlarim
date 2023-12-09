package day28_passByValue;

import java.util.Arrays;

public class C05_PassByValue_CokElementliYapilar {
	public static void main(String[] args) {
		int [] arr = {3,4,5};

		//Verilen int array'in elementlerinin değerlerini 2 arttıtıp Array'in yeni halini yazdıran method oluşturun.
		System.out.println("Main method arrayi : " + Arrays.toString(arr));

		elemanlariAttripYazdir(arr);

		System.out.println("Main method arrayi method sonrası  : " + Arrays.toString(arr));

		//Verilen array'e 5 elemanlı yeni bir array atayıp yeni halini yazdıran method oluşturun
		System.out.println("Main method 2. method call öncesi" + Arrays.toString(arr));
		yeniArrayAta(arr);
		System.out.println("Main method 2. method call sonrası" + Arrays.toString(arr));

	}

	public static void elemanlariAttripYazdir(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i]+2;

		}
		System.out.println("Methodta arrayin değeri " + Arrays.toString(arr));
	}

	public static void yeniArrayAta(int[] arr){
		arr = new int[5];
		System.out.println("İkinci Methodta arr " + Arrays.toString(arr));
	}
}
