package day20_aarrays2;

public class C05_CiftSayilariTopla {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int toplam =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) toplam+=arr[i];
		}
		System.out.println("Toplam = " + toplam);

	}
}
