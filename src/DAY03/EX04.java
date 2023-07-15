package DAY03;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int data;
        System.out.print("정수를 입력하시오: ");
        data = input.nextInt();
        
        if (data % 2 == 0)
            System.out.printf("입력하신 %d는(은) 짝수!\n", data);
        else
            System.out.printf("입력하신 %d는(은) 홀수!\n", data);

        input.close();
    }
}
