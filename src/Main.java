import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Class one = new Class (0,0,0,0,1,1);

        for (int i = 1; i < 1000; i++) {
            one.printInfo();
            String action = scan.next();
        if (action.equals("Fish")){
            one.Fish("rodtype1");}
        else if (action.equals("sell")){
                one.sell();}
        else if (action.equals("coinflip")){
            System.out.println("How much would you like to wager");
            int wager = scan.nextInt();
            System.out.println("what do you call");
            String call = scan.next();
            one.coinFlip(call, wager);

            }

    }
    }
}