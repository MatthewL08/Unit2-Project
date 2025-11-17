import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random()*2+1);
        System.out.println(random);
    }
}