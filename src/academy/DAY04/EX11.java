package academy.DAY04;

public class EX11 {
    public static void main(String[] args) {
        String str = new String("JavaProgramming");
        // String str = "JavaProgramming"

        System.out.println(str.length());
        System.out.println(str.charAt(4));

        String addStr;
        addStr = "A";
        System.out.println(addStr);
        addStr += "B";
        System.out.println(addStr);
        System.out.println(str.charAt(0) == 'J');
        System.out.println(str.charAt(0) == 'j');
        System.out.println(str.charAt(1) -32);  //97 - 32 = 65
        System.out.println((char)str.charAt(1)-32);


    }
}
