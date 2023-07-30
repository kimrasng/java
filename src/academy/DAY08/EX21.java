package academy.DAY08;

import java.util.ArrayList;
import java.util.HashSet;

public class EX21 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("라면");
        hs.add("김밥");
        hs.add("튀김");
        hs.add("떡뽁이");

        System.out.println("HashSet : " + hs);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("라면");
        arr.add("김밥");
        arr.add("튀김");
        arr.add("떡뽁이");
    }
}
