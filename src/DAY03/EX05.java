package DAY03;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, max = 0, min = 0;

        System.out.print("첫 번째 정수입력: ");
        a = input.nextInt();
        System.out.print("두 번째 정수입력: ");
        b = input.nextInt();

        if (a > b) {
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }

        System.out.println("큰 값 : " + max + " 작은 값 : " + min);

        input.close();
    }
}
