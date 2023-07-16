package academy.DAY03;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("정수 입력: ");
        num = input.nextInt();

        switch (num%3) {
            case 0: System.out.println("3의 배수 입니다."); break;
            default: System.out.println("3의 배수가 아닙니다.");
        }



        input.close();
    }
}
