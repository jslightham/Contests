import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = Integer.parseInt(in.nextLine());
		
		for(int i =0; i<numInputs; i++) {
			String temp = in.nextLine();
			int numTimes = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
			for(int j = 0; j<numTimes; j++) {
				System.out.print(temp.substring(temp.indexOf(" ")));
			}
		}
	}
}
