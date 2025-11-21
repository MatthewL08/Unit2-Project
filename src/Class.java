import java.util.Objects;

public class Class {
    private int coins;
    private int misc;
    private int salmon;
    private int tuna;
    private final int salmonPrice;
    private final int tunaPrice;
    private String rodType;
    private int baitAmount;


    public Class(int coins, int misc, int salmon, int tuna, int salmonPrice, int tunaPrice, String rod, int baitAmount) {
        this.coins = coins;
        this.misc = misc;
        this.salmon = salmon;
        this.tuna = tuna;
        this.salmonPrice = salmonPrice;
        this.tunaPrice = tunaPrice;
        rodType = rod;
        this.baitAmount = baitAmount;

    }

    public void Fish() {
        int fish = (int) ((Math.random() * 100) + 1);
        switch (this.rodType) {
            case "basic" -> {
                if (fish == 100) {
                    misc++;
                    return;
                } else if ((fish < 100) && (fish > 90)) {
                    tuna++;
                    return;
                }
                salmon++;
            }
            case "bamboo" -> {
                if (fish >= 95) {
                    misc++;
                    return;
                } else if (fish > 75) {
                    tuna++;
                    return;
                }
                salmon++;
            }
            case "steel" -> {
                if (fish > 80) {
                    misc++;
                    return;
                } else if ((fish < 80) && (fish > 40)) {
                    tuna++;
                    return;
                }
                salmon++;
            }
        }
    }


    public void printInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("coins: " + coins + " catches: Salmon:" + salmon + ", tuna: " + tuna + ", misc: " + misc);
        System.out.println("-----------------------------------------------");
        System.out.print("what would you like to do?  ");

    }


    public void sell() {
        int salmonProfit = salmonPrice * salmon;
        int tunaProfit = tunaPrice * tuna;
        int total = salmonProfit + tunaProfit;
        salmon = 0;
        tuna = 0;
        coins = coins + total;
        System.out.println("You made " + total + " coins, current total is " + coins);

    }

    public void coinFlip(String call, int wager) {
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
    }

    public void newRod() {
        System.out.println("Bamboo rod: misc 5%/tuna 20%/Salmon 75%");
        System.out.println("steel rod: misc 20%/tuna 40%/Salmon 40%");
        System.out.println();
    }

    public void purchase(String material, int amount) {
        rodType = material;
        switch (material) {
            case "bamboo" -> coins = coins - 150;
            case "steel" -> coins = coins - 600;
            case "bait" -> {
                if (2 * amount > coins) {
                    baitAmount = coins / 2;
                    coins = coins % 2;
                } else {
                    baitAmount = amount;
                    coins = coins - 2 * amount;
                }
            }
        }

    }
}