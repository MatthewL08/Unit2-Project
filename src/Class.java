public class Class {
    private int coins;
    private int misc;
    private int salmon;
    private int tuna;
    private double salmonPrice;
    private double tunaPrice;

    public Class(int coins, int misc, int salmon, int tuna ,double salmonPrice, double tunaPrice)
    {
        this.coins = coins;
        this.misc = misc;
        this.salmon = salmon;
        this.tuna = tuna;
        this.salmonPrice = salmonPrice;
        this.tunaPrice = tunaPrice;

    }

    public void Fish (String rod) {
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





    public double sell (){
            double salmonProfit = salmonPrice * salmon;
            double tunaProfit = tunaPrice * tuna;
            double total = salmonProfit + tunaProfit ;


        return total;
    }

    public boolean coinFlip(String call) {
        int random = (int) (Math.random() * 2 + 1);
        String coin = "";
        if (random == 1) {
            coin = "heads";}
        else {
            coin = "tails"; }
        return call == coin;
    }

}
