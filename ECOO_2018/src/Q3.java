import java.util.Scanner;

public class Q3 {
	public static String sRemoved;
	public static String removed;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		sRemoved = in.nextLine();
		
		while(!sRemoved.equals("done")) {
			removed += scan(sRemoved);
		}
		System.out.println(removed);
		
	}
	public static String scan(String s) {
		
		if(s.indexOf(":") != -1) {
			if(s.substring(s.indexOf(":" + 1)).indexOf(":") != -1){
				return s.substring(s.indexOf(":"), s.substring(s.indexOf(":" + 1)).indexOf(":"));
			}
		}
		sRemoved = "done";
		return "";
		
		
		
		
		
		
	}
}
