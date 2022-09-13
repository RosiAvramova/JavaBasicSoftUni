package ForLoopLab;

import java.util.Scanner;

public class NumbersNto100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; n>=1; n--){
            System.out.println(n);
        }
    }
}
