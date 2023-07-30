package academy.DAY08;

import java.util.HashSet;

public class EX22 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        boolean bool;
        bool = hs.add("라면");
        System.out.println(bool);
        bool = hs.add("김밥");
        System.out.println(bool);
        bool = hs.add("튀김");
        System.out.println(bool);
        bool = hs.add("떡뽁이");
        System.out.println(bool);
        bool = hs.add("떡뽁이");
        System.out.println(bool);

        System.out.println(hs);
        
        hs.remove("라면");
        System.out.println(hs);
    }
}
