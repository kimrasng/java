package academy.DAY04;

public class EX09 {
    public static void main(String[] args) {
        String ref_1 = "펭수";
        String ref_2 = new String("펭수");
        String ref_3 = "범이";

        System.out.println(ref_1 == ref_2);
        System.out.println(ref_1 != ref_2);
        System.out.println(ref_1 == ref_3);


        // false : ref_1, ref_2참조 변수는 서로 다른 주소를 저장하고 있다.
        // true : ref_1, ref_2참조 변수는 서로 다른 주소를 저장하고 있다.
        // false : ref_1, ref_3참조 변수는 서로 다른 주소를 저장하고 있다.


    }
}
