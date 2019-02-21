import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String names = "";
		for(int i = 0; i<num; i++) {
			String challenger = in.nextLine();
			int space = challenger.indexOf(" ");
			if(isChallenger(challenger)) {
				names += challenger.substring(0, space) + " ";
			}
		}
		String[] namesSplit = names.split(" ");
		for(int j =0; j<namesSplit.length; j++) {
			System.out.println(namesSplit[j]);
		}
		
	}
	
	public static boolean isChallenger(String challenger) {
		int space = challenger.indexOf(" ");
		
		if(Integer.parseInt(challenger.substring(space+1)) > 9001){
			return true;
		}
		return false;
	}
}
