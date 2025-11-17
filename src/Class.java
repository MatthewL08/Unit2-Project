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

    public String Fish (String rod) {
        int fish = (int) ((Math.random() * 100) + 1);
        if (rod.equals("rodtype1")) {
            if (fish == 100) {
                misc++;
                return "misc";
            } else if ((fish < 100) && (fish > 50)) {
                tuna++;
                return "tuna";
            }
            salmon++;
            return "salmon";
        } else if (rod.equals("rodtype2")) {
            if (fish == 100) {
                misc++;
                return "misc";
            } else if ((fish < 100) && (fish > 50)) {
                tuna++;
                return "tuna";
            }
            salmon++;
            return "salmon";
        } else if (rod.equals("rodtype3")) {
            if (fish == 100) {
                misc++;
                return "misc";
            } else if ((fish < 100) && (fish > 50)) {
                tuna++;
                return "tuna";
            }
            salmon++;
            return "salmon";
        }
    return "error";
    }
















    public void printInfo() {
        int catches = misc + salmon + tuna;
        System.out.println("-----------------------------------------------");
        System.out.println("coins: " + coins + "           catches: " + catches);
        System.out.println("-----------------------------------------------");
        System.out.print("what would you like to do?  ");
    }





    public double market (String type, int catches){
            double salmonProfit = salmonPrice * catches;
            double tunaProfit = tunaPrice * catches;
            double total = salmonProfit + tunaProfit ;


        return total;
    }

    public boolean coinFlip(String call) {
        int random = (int) (Math.random() * 1 + 1);
        String coin = "";
        if (random == 1) {
            coin = "heads";}
        else {
            coin = "tails"; }
        return call == coin;
    }

}
