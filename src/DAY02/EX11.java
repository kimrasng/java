package DAY02;

public class EX11 {
    public static void main(String args){
        int n1 = 2;
        if (n1 == 2) {
            int n2 = 10;
            System.out.println(n2);
        }
        // System.out.println(n2); // ERROR

        // 변수는 설정 된 지역내에서만 사용이 가능

        // 지역을 표시하기 위해서 “{}”를 사용

        // JAVA 에서 전역 변수 사용은 객체 변수, 클래스 변수 등의 개념으로 사용
        // n1 변수의 경우 Main Method 영역에서 생성
        // n2 변수의 경우 if 제어문 영역에서 생성
        // n2 변수의 경우 if 제어문 영역을 벗어난 곳에서는 사용이 불가능
    }
}
