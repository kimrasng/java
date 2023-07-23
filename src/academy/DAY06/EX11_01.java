package academy.DAY06;

public class EX11_01 {
    static int classVariable = 100;
    int instanceVariable = 200;

    public static void main(String[] args) {
        int localVariable = 300;

        System.out.println("클래스 변수 : " + classVariable);
//        System.out.println("인스턴스 변수 : " + instanceVariable);
        System.out.println("지역 변수 : " + localVariable);
    }
}