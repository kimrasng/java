package academy.DAY04;

public class EX05 {
    public static void main(String[] args){
        int su = 0, sum = 0;
        do {
            su++;
            sum += su;
        }while (su <= -1);
        System.out.println("do~while sum: " + sum);

        su = 0; sum = 0;
        System.out.println("do~while sum: " + sum);

        su = 0; sum = 0;
        while (su <= -1) {
            su++;
            sum += su;
        }
        System.out.println("while sum: " + sum);
    }
}
