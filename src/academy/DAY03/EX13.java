package academy.DAY03;

public class EX13 {
    public static void main(String[] args) {
        int count = 0;

        for (int su1=1; su1 <= 10; su1++){
            for (int su2=1; su2 <= 10; su2++){
                count += 1;
            }
        }
        System.out.println("count(반복 횟수):" + count);
    }
}
