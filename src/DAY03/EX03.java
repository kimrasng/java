package DAY03;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int chose;

        System.out.println("1. Easy Game Start");
        System.out.println("2. Hard Game Start");
        System.out.println("3. Game Exit");

        System.out.print("번호 선택 >> ");
        chose = input.nextInt();

        if (chose == 1)
            System.out.println("Easy Game Start!");

        if (chose == 2)
            System.out.println("Hard Game Start!");

        if (chose == 3)
            System.out.println("Game EXIT !");

        input.close();
    }
}
