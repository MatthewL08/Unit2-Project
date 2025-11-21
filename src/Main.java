import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Class one = new Class(0, 0, 0, 0, 3, 8, "basic", 0);

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
                    System.out.println("what bait or type of rod");
                    String material = scan.next();
                    if (material.equals("bait")) {
                        System.out.println("how many would you like to purchase?");
                        int amount = scan.nextInt();
                        one.purchase(material, amount);
                    } else {
                        one.purchase(material, 0);
                    }
                }
                case "market" -> one.newRod();

            }
        }
    }
}
