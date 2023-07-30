package academy.DAY08;

import java.util.HashMap;

public class EX25 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("세탁기", "150만원");
        map.put("건조기", "150만원");
        map.put("에어컨", "100만원");
        System.out.println(map);
        System.out.println(map.remove("에어컨"));
        System.out.println(map);

        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

    }
}
