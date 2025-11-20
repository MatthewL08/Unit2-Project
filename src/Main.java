import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Class one = new Class(0, 0, 0, 0, 1, 1, "bamboo");

        for (int i = 1; i < 1000; i++) {
            one.printInfo();
            String action = scan.next();
            switch (action) {
                case "fish" -> one.Fish();
                case "sell" -> one.sell();
                case "coinflip" -> {
                    System.out.println("How much would you like to wager");
                    int wager = scan.nextInt();
                    System.out.println("what do you call");
                    String call = scan.next();
                    one.coinFlip(call, wager);
                }
                case "purchase" -> {
                    System.out.println("what type of rod");
                    String material = scan.next();
                    System.out.println(one.purchase(material));
                }
                case "market" -> one.newRod();

            }
        }
    }
}