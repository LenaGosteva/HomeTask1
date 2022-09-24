import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt(), sum = n*(a*100+ b);
        System.out.println(sum /100 + " " + sum%100);
    }
}