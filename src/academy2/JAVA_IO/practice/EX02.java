package practice;

import java.util.Scanner;

public class EX02 {

    // 정수 하나를 매개변수로 받아서
    // 1부터 그 수만큼까지의 합을 구한 후
    // 그 합을 반환해주는 메소드 만들기 sum
    // 예 ) 3 >> 1 + 2 +3 합은 6을 반환

    public static int sum(int num) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i; // sum = sum + i

        }

        return sum;

    }

    public static void main(String[] args) {

        int sum = sum(50);
        System.out.println("1부터 100까지의 합 : " + sum);
    }
}
