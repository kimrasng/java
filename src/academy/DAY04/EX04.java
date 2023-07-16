package academy.DAY04;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kor;

        while (true) {
            System.out.println("국어 점수 입력: ");
            kor = input.nextInt();
            if (kor > 100 || kor < 0)
                System.out.println("0~100점 사이 값을 입력하세요.");
            else {
                System.out.println("국어 점수: " + kor);
                break;
            }
        }
//
//        do ~ whil문의 경우 종속문장은 무조건 1번은 실행 된다.
//
//        조건식이 처음부터 거짓이지만 종속문장을 실행
//
//        동일한 조건의 while문을 함께 작성하여 비교작업 진행
//
//        while문은 조건식이 처음부터 거지싱므로 실행하지 않는다.




        input.close();
    }
}
