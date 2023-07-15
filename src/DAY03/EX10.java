package DAY03;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int data;
        System.out.print("정수를 입력하세요: ");
        data = input.nextInt();

        for (int i = 0; i < data; i++) {
            System.out.println(i+1 + "번 반복");
        }
        input.close();
    }
}
