import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), h = x /3600, min = (x%3600)/60, sec = (x%3600)%60;
        String stmin = String.valueOf(min), stsec = String.valueOf(sec);
        if (min < 10){
            stmin = "0" + stmin;
        }
        if (sec < 10){
            stsec = "0" + stsec;
        }
        System.out.println(h + ":" + stmin + ":" + stsec);
    }
}