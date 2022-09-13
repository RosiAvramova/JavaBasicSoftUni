package ConditionalStatments.P1;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String result = "";

       if (speed <= 10){
           result = "slow";
       }
       else if (speed <= 50){
           result = "average";
       }
       else if (speed <= 150){
           result = "fast";
       }
       else if (speed <= 1000){
           result = "ultra fast";
       }
       else{
           result = "extremely fast";
       }

       System.out.println(result);
    }
}
