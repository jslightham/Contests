import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        //Integer.parseInt(s)
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        String input = in.nextLine();
        String[] inputs = input.split(" ");
        int greatest = 0;

        int regScore = 0;
        for(int i=0;i<inputs.length - 1;i+=2) {
            if(getHandValue(inputs, i) > greatest) {
                greatest = getHandValue(inputs, i);
            }
        }
        System.out.println(greatest);
    }

    public static int getHandValue(String[] hand, int pairIndex) {
        int value = 0;
        for(int j = 0; j<pairIndex; j+=2) {
            value+=Integer.parseInt(hand[j]);
        }
        value += Integer.parseInt(hand[pairIndex]) + Integer.parseInt(hand[pairIndex + 1]);


        for(int j = pairIndex + 3; j<hand.length; j+=2) {
            value+=Integer.parseInt(hand[j]);
        }

        return value;

    }

}

