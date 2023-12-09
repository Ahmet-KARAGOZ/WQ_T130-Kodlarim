package Practice_Lessons;

import java.util.Arrays;

public class p10_ArraydakiSayilarinToplami {
	public static void main(String[] args) {
		//Create an array of 5 floats and calculate their sum.

		float[] numbers = new float[5];
		numbers[0] = 1.1f;
		numbers[1] = 2.2f;
		numbers[2] = 3.3f;
		numbers[3] = 4.4f;
		numbers[4] = 5.5f;

		System.out.println(Arrays.toString(numbers));

		float toplam = 0f;
		for (float i : numbers) toplam += i;
		System.out.println("Toplam = " + toplam);



		int i = 0;
		float sum = 0f;
		while (i < numbers.length){
			sum+=numbers[i];
			i++;
		}
		System.out.println("While Sonucu = " + sum);


		sum = 0;
		int ind = numbers.length-1;
		while (ind>=0){
			sum+=numbers[ind];
			ind--;
		}
		System.out.println("Tersten While ile = " + sum);

	}
}
