package academy.DAY08;


public class EX10 {
    public static void main(String[] args) {
        try {
            System.out.println("수행 코드 작성 영역!");
            // 예외 발생 시 아래 라인을 주석 해제하여 테스트해보세요.
            // throw new NullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer 예외가 발생될 경우 실행!");
        }
        catch (Exception e) {
            System.out.println("예외 발생시 수행 할 코드 작성 영역!");
        }
        finally {
            System.out.println("예외 여부와 상관 없이 무조건 실행!");
            System.out.println("Finally는 생략이 가능하다!");
        }
    }
}
