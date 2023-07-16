package academy.DAY03;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char data;

        System.out.print("문자를 입력하세요: ");
        data = input.next().charAt(0);

        if (data == 'A')
            System.out.println("A 입력!");

        else if (data == 'B')
            System.out.println("B 입력!");

        else if (data == 'C')
            System.out.println("C 입력!");

        else
            System.out.println("그 외 다른 문자 입력!");

        input.close();

    }
}
