package academy.DAY08;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EX15 {
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요: ");

        try {
            int number = numberInput();
            System.out.println("입력값 : " + number);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }

    public static int numberInput() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }
}
