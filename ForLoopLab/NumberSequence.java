package ForLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 1; i<=n; i++){
            int currNum = Integer.parseInt(scanner.nextLine());
            if (currNum>maxNum){
                maxNum = currNum;
            }
            if (currNum<minNum){
                minNum = currNum;
            }


        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
