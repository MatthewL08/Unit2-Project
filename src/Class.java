import java.util.Objects;

public class Class {
    private int coins;
    private int misc;
    private int salmon;
    private int tuna;
    private int salmonPrice;
    private int tunaPrice;

    public Class(int coins, int misc, int salmon, int tuna, int salmonPrice, int tunaPrice) {
        this.coins = coins;
        this.misc = misc;
        this.salmon = salmon;
        this.tuna = tuna;
        this.salmonPrice = salmonPrice;
        this.tunaPrice = tunaPrice;

    }

    public void Fish(String rod) {
        int fish = (int) ((Math.random() * 100) + 1);
        switch (rod) {
            case "rodtype1" -> {
                if (fish == 100) {
                    misc++;
                    return;
                } else if ((fish < 100) && (fish > 50)) {
                    tuna++;
                    return;
                }
                salmon++;
            }
            case "rodtype2" -> {
                if (fish == 100) {
                    misc++;
                    return;
                } else if ((fish < 100) && (fish > 50)) {
                    tuna++;
                    return;
                }
                salmon++;
            }
            case "rodtype3" -> {
                if (fish == 100) {
                    misc++;
                    return;
                } else if ((fish < 100) && (fish > 50)) {
                    tuna++;
                    return;
                }
                salmon++;
            }
        }
    }


    public void printInfo() {
        int catches = misc + salmon + tuna;
        System.out.println("-----------------------------------------------");
        System.out.println("coins: " + coins + " catches: Salmon:" + salmon + ", tuna: " + tuna + ", misc: " + misc);
        System.out.println("-----------------------------------------------");
        System.out.print("what would you like to do?  ");

    }


    public int sell() {
        int salmonProfit = salmonPrice * salmon;
        int tunaProfit = tunaPrice * tuna;
        int total = salmonProfit + tunaProfit;
        salmon = 0;
        tuna = 0;
        coins = coins + total;
        System.out.println("You made " + total + "coins, current total is " + coins);
        return total;
    }

    public boolean coinFlip(String call, int wager) {
        int random = (int) (Math.random() * 2 + 1);
        String coin;
        if (wager > coins) {
            wager = coins;
        }
        if (random == 1) {
            coin = "heads";
        } else {
            coin = "tails";
        }
        if (Objects.equals(call, coin)) {
            coins = coins + wager;
            System.out.println("you win");
        } else {
            coins = coins - wager;
            System.out.println("you lost");
        }
        return Objects.equals(call, coin);
    }

    public void market() {

    }
}
