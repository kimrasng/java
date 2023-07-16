package academy.DAY04;

public class EX08   {
    public static void main(String[] args){
        String ref_1 = "펭수";
        String ref_2 = "펭수";
        String ref_3 = "범이";

        System.out.println(ref_1 == ref_2);
        System.out.println(ref_1 != ref_2);
        System.out.println(ref_1 == ref_3);
    }
//    true : ref_1, ref_2참조 변수는 동일 한 주소를 저장하고 있다.
//
//  false : ref_1, ref_2참조 변수는 동일 한 주소를 저장하고 있다.
//
//  false : ref_1, ref_2참조 변수는 서로 다른  주소를 저장하고 있다.
}
