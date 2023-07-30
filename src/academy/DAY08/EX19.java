package academy.DAY08;

import java.util.ArrayList;

public class EX19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("123");
        list.add("456");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove("123");
        System.out.println("Remove 후 리스트");
        System.out.println(list.get(0));

        list.clear();
        System.out.println("Clear후 리스트");
    }
}
