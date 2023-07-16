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
        // whil문의 조건식에 따라 조건이 참일 경우 반복한다.
        // data 변수의 입력 된 값 만큼 반복작업을 수행한다.
        // 종속문장에서는 sum변수에 i 값을 누적 저장한다.
        // while문과 for문은 서로 호환이 가능하다 (대체가능)

        System.out.println("1~data 까지의 누적합: " + sum);
        input.close();
    }
}
