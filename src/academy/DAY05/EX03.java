package academy.DAY05;

class 인사 {
    public void MethodTest_EX03(){
        System.out.println("안녕하세요");
        System.out.println("반갑습니다.");
        System.out.println("또 만나요.");
    }
}
public class EX03 {
    public static void main(String[] args){
        인사 hi = new 인사();
        hi.MethodTest_EX03();
    }
}
