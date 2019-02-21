import java.util.Scanner;

public class Q4 {
	public static int[] top = new int[] {1, 2};
	public static int[] bottom = new int[] {3, 4};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] inputArr = input.split("");
		for(int i =0; i<inputArr.length; i++) {
			if(inputArr[i].equals("V")) {
				vFlip();
			}
			if(inputArr[i].equals("H")) {
				hFlip();
			}
		}
		print();
	}
	
	public static void hFlip() {
		int temp1 = top[0];
		int temp2 = top[1];
		top[0] = bottom[0];
		top[1] = bottom[1];
		bottom[0] = temp1;
		bottom[1] = temp2;
	}
	
	public static void vFlip() {
		int temp1 = top[0];
		int temp2 = bottom[0];
		top[0] = top[1];
		bottom[0] = bottom[1];
		top[1] = temp1;
		bottom[1] = temp2;
	}
	
	public static void print() {
		System.out.println(top[0] + " " + top[1]);
		System.out.println(bottom[0] + " " + bottom[1]);
	}
}
