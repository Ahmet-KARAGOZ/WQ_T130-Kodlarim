package day19_arrays;

public class C03_popzitifSayilariToplama {
	public static void main(String[] args) {

		int[] arr = {-8, 5, 6, 0, -6, 10, 8};
		System.out.println(pozitifSayilariTopla(arr));

	}

	public static int pozitifSayilariTopla(int[] arr) {
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				toplam = toplam + arr[i];
			}
		}
		return toplam;
	}
}
