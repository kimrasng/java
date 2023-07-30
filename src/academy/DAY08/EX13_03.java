package academy.DAY08;

public class EX13_03 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            for (int i=0; i < 5; i++) {
                System.out.println(arr[i] + "   ");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
