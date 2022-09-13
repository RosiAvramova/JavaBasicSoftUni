package ConditionalStatments.P1;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figuire = scanner.nextLine();
        double area = 0;

        if (figuire.equals("square")){
            double sideA = Double.parseDouble(scanner.nextLine());
            area = sideA*sideA;
        }
        else if (figuire.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA*sideB;
        }
        else if (figuire.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI*radius*radius;
        }
        else if (figuire.equals("triangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1*side2/2;
        }

        System.out.printf("%.3f", area);

    }
}
