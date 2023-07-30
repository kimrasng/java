package academy.DAY08;

import java.util.HashMap;

public class EX24 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "test");
        hm.put(1, "hello");
        System.out.println(hm.get(0));
        System.out.println(hm.get(1));

        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        hm2.put("선풍기", 10);
        hm2.put("공기청정기", 100);
        hm2.put("에어컨", 150);
        System.out.println("선풍기 : " + hm2.get("선풍기") + "만원");
        System.out.println("공기청정기 : " + hm2.get("공기청정기") + "만원");
        System.out.println("에어컨 : " + hm2.get("에어컨") + "만원");

        System.out.println(hm2.containsKey("정수기"));
        System.out.println(hm2.containsValue("300"));

    }
}
