public class Class {
    private int coins;
    private int catches;


    public boolean coinFlip(String call) {
        int random = (int) (Math.random() * 1 + 1);
        String coin = "";
        if (random == 1) {
            coin = "heads";}
        else {
            coin = "tails"; }
        if (call == coin) {
            return true;}
        else {
            return false; }
    }

    public void printInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("coins: " + coins + "           catches: " + catches);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("what would you like to do? (options: coinflip, fish)");
    }
}
