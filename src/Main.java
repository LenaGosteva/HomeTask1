import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double x = in.nextDouble();
        if ((x>=-2.0 && x <=3.0) || (x >= 6.0 && x <= 9.0)){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

    }
}