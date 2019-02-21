import java.util.Scanner;
public class Q1 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a1 = in.nextInt();
			int a2 = in.nextInt();
			int a3 = in.nextInt();
			int appleScore = a1*3 + a2*2 + a3*1;
			int b1 = in.nextInt();
			int b2 = in.nextInt();
			int b3 = in.nextInt();
			int bananaScore = b1*3 + b2*2 + b3*1;
			
			if(appleScore > bananaScore) {
				System.out.println("A");
			}else if(bananaScore > appleScore) {
				System.out.println("B");
			}else {
				System.out.println("T");
			}
			
		}
	}
