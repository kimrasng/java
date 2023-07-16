package academy.DAY04;

public class EX22 {
    public static void main(String[] args){
        double ran1 = Math.random();
        double ran2 = Math.random() * 3 + 1;
        int ran3 = (int)(Math.random() * 3 + 1);
        int ran4 = (int)(Math.random() * (20 - 10 + 1) + 10);
        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);
        System.out.println(ran4);
    }
}
