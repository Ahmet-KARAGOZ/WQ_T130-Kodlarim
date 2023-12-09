package day21_arrays_MultiDimensionalArrays;

public class C09_MDA_SayilarinCarpimi {
	public static void main(String[] args) {
		int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

		System.out.println("Çarpimları = " + elementlerinCarpimi(arr));
	}

	public static int elementlerinCarpimi(int[][] arr){
		int carpim =1;
		for (int[] arrU : arr ){
			for (int arrIc: arrU) carpim*=arrIc;
		}
		return carpim;
	}
}
