import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(), sum = i/100 + (i/10)%10 + i % 10;
        System.out.println(sum + " " + (i + 2 - i%2));
    }
}