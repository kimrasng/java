package DAY03;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int data;
        System.out.print("입력: ");
        data = input.nextInt(); // data 변수를 입력받아 data의 값을 조건식으로 사용

        if (data > 10)  // data 변수의 값이 10ㅂ다 클경우 조건을 참으로, 종속문장을 실행
            System.out.println("종속 문장 실행"); // 만약 조건식이 거짓일경우 종속문장을 실행하지 않고 다음문장을 실행
        
        System.out.println("다음 문장 실행");

        input.close();

    }
}
