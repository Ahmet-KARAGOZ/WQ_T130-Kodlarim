package day27_constructorCall;

public class Rope {
	public static void swing(){
		System.out.print("swing ");
	}

	public void climb(){
		System.out.print("climb ");
	}

	public static void play(){
		swing();
		//climb(); Static olduğundan dolayı burada  çağıramayız.
	}

	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();

	}
}
