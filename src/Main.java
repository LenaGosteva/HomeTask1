import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if(((100 <= a && 999>=a)|| (-100 >= a && -999<=a))&&(100 <= b && 999>=b)|| (-100 >= b && -999<=b)){
            if (a % 5 == 0 && b % 5 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else if(((100 <= a && 999>=a)|| (-100 >= a && -999<=a))&&(100 <= c && 999>=c)|| (-100 >= c && -999<=c)){
            if (a % 5 == 0 && c % 5 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else if(((100 <= c && 999>=c)|| (-100 >= c && -999<=c))&&(100 <= b && 999>=b)|| (-100 >= b && -999<=b)){
            if (c % 5 == 0 && b % 5 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}