package ForLoopLab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<=n; i+=2){
            System.out.println(num);
            num = num*2*2;
        }
    }
}
