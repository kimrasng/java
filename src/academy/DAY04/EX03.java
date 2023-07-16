package academy.DAY04;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int data, sum = 0;
        int i = 1;
        System.out.print("숫자를 입력하세요: ");
        data = input.nextInt();

        while (i <= data){
            sum += i;
            i++;
        }

        System.out.println("1~data 까지의 누적합: " + sum);
        input.close();



    }
}
