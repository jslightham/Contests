import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
	public static int ruleNum = 0;
	public static String ret;
	public static ArrayList<String> rules = new ArrayList<String>();
	public static ArrayList<String> rules2 = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = 0;
		String initial = "", finish = "";
		String temp = "";
		boolean isFinished = false;
		
		while(!isFinished) {
			temp = in.nextLine();
			try {
				s = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
				initial = temp.substring(temp.indexOf(" ") + 1, temp.indexOf(" ", temp.indexOf(" ")+1));
				finish = temp.substring(temp.indexOf(" ", temp.indexOf(" ") + 1) + 1);
				isFinished = true;
			}catch(Exception e){
				rules.add(temp.substring(0, temp.indexOf(" ")));
				rules2.add(temp.substring(temp.indexOf(" ") +1));
			}
			
		}
		ret = initial;
		
		completeNext();
		for(int i = 0; i<initial.length(); i++) {
			
			
		}
		
		System.out.println(s);
		System.out.println(initial);
		System.out.println(finish);
		System.out.println(rules);
		System.out.println(rules2);
		System.out.println(ret);
		
	}
	
	public static int completeNext() {
		for(int j = 0; j<rules.size(); j++) {
			if(ret.contains(rules.get(j))) {
				ret = ret.substring(0, ret.indexOf(rules.get(j))) + ret.substring(ret.indexOf(rules.get(j)) + rules.get(j).length());
			}
		}
		return 0;
	}
}