public class Class {
    private int coins;
    private int catches;
    private double salmonCost;
    private double tunaCost;

    public Class(int coins, int catches)
    {
        this.coins = coins;
        this.catches = catches;
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
    
    public void printInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("coins: " + coins + "           catches: " + catches);
        System.out.println("-----------------------------------------------");
        System.out.print("what would you like to do?  ");
    }

    public double market (String type, int catches){
            double salmonPrice = salmonCost * catches;
            double tunaPrice = tunaCost * catches;
            double total = salmonPrice + tunaPrice ;


        return total;
    }


}
