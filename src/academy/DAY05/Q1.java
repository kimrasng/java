package academy.DAY05;

public class Q1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            int ran = (int)(Math.random() * 45 + 1);
            System.out.println(ran);
            i++;
        }
    }
}
