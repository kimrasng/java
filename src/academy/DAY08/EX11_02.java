package academy.DAY08;

public class EX11_02 {
    public static void main(String[] args) {
        try {
            Class Test = Class.forName("Animal");
        } catch (Exception e) {
            System.out.println("예외 발생!");
        }
    }
}
