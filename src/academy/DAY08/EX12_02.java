package academy.DAY08;

public class EX12_02 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException 발생!");
        }
        finally {
            System.out.println("무조건 실행, 생략 가능하지 않음!");
        }
    }
}
