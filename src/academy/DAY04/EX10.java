package academy.DAY04;

public class EX10 {
    public static void main(String[] args){
        String ref_1 = "펭수";
        String ref_2 = new String("펭수");
        String ref_3 = "범이";

        System.out.println(ref_1.equals(ref_2));
        System.out.println(ref_1.equals(ref_3));

        // true : ref_1, ref_2 참조 변수는 서로 같은 문자열 값을 갖는다.
        // false : ref_1, ref_3 참조 변수는 서로 같은 문자열 값을 갖는다.

    }
}
