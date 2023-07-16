package academy.DAY04;

public class EX12 {
    public static void main(String[] args){
        String str = new String("java is Easy");
        System.out.println("기본: " + str);
        System.out.println("소문자 변환: " + str.toLowerCase());
        System.out.println("소문자 변환: " + str.toUpperCase());

        String changeStr = new String();
        changeStr = str.replace("Easy", "Hard");
        System.out.println("문자열 치환" + changeStr);

        String[] arrStr = str.split("is");
        System.out.println("문자열 분리: " + arrStr[0] + "*");
        System.out.println("문자열 분리" + "*" + arrStr[1]);

        String[] arrStr2 = str.split("is");
        arrStr2[0] = arrStr2[0].trim();
        arrStr2[1] = arrStr2[1].trim();
        System.out.println("문자열 분리: " + arrStr2[0] + "*");
        System.out.println("문자열 분리: " + "*" + arrStr2[1]);

        // .toLowerCase() : 지정 된 문자열을 소문자로 반환한다.
        // .toUpperCase() : 지정 된 문자열을 대문자로 반환한다.
        // .replace("old", "new") : 지정 된 문자를 새로운 문자로 치환한다.
        // .split(regex) : 지정 된 값을기준으로 문자열을 분리한다.
        // 위 메소드들의 경우 변경사항을 저장해야 변경 내용이 유지된다.
        // .split() : 메소드의 경우 배열을 이용하여 분리 된 문자열을 따로 저장
        // .trim() : 지정 된 문자열의 앞뒤 공백을 제거한다.

    }
}
