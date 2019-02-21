import java.util.Scanner;
public class Q3 {
	public static String ret = "";
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<numInputs; i++) {
			String temp = in.nextLine();
			while(!temp.equals("")) {
				temp = remove(temp);
			}
			System.out.println(ret);
			ret = "";
		}
		
	}
	
	public static String remove(String temp) {
		int lastIndex = getLastIndex(temp);
		String firstPart = temp.substring(0, lastIndex + 1);
		
		ret += firstPart.length() + " " + temp.substring(0, 1) + " ";
		return temp.substring(firstPart.length());
	}
	public static int getLastIndex(String str) {
		String target = str.substring(0, 1);
		
		for(int i = 0; i<str.length(); i++) {
			if(str.substring(i, i+1).equals(target)) {
				
			}else if(str.length() == i) {
				return str.length() - 1;
			}
			else {
				return i - 1;
			}
		}
		return str.length() - 1;
	}
}
