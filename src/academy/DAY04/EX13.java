package academy.DAY04;

public class EX13 {
    public static void main(String[] args){
        int[] arrayInt1 = new int[10];
        arrayInt1[0] = 1;
        arrayInt1[9] = 10;

        System.out.println(arrayInt1[0]);
        System.out.println(arrayInt1[9]);

        System.out.println(arrayInt1[7]);

        int[] arrayInt2 = new int[3];
        System.out.println(arrayInt2[0]);
        System.out.println(arrayInt2[1]);
        System.out.println(arrayInt2[2]);
//        System.out.println(arrayInt2[3]);
        // java.lang.ArrayIndex0ut0fBoundsException

        int[] arrayInt3 = new int[] {10, 20, 30};
        int[] arrayInt4 = {40, 50, 60, 70};

        System.out.println(arrayInt3[0]);
        System.out.println(arrayInt3[1]);
        System.out.println(arrayInt3[2]);

        System.out.println(arrayInt4[0]);
        System.out.println(arrayInt4[1]);
        System.out.println(arrayInt4[2]);
        System.out.println(arrayInt4[3]);

        System.out.println(arrayInt3[0] + arrayInt4[0]);

//        int[] arrayInt5;
//        arrayInt5 = new



    }
}
