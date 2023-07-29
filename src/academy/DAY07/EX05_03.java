package academy.DAY07;

import java.util.Scanner;

class SetGet_03 {
    private int kor, eng, mat;

    public void getPrint() {
        int result = this.kor + this.eng + this.mat;
        System.out.println("국어 점수 : " + getKor());
        System.out.println("영어 점수 : " + getEng());
        System.out.println("수학 점수 : " + getMat());
        System.out.println("3과목의 합 점수 : " + result); // 수정된 부분
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }
}

public class EX05_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SetGet_03 sg = new SetGet_03();
        int kor, eng, mat;

        System.out.print("국어 영어 수학 점수 입력 : ");
        kor = input.nextInt();
        eng = input.nextInt();
        mat = input.nextInt();
        input.close();

        sg.setKor(kor);
        sg.setEng(eng);
        sg.setMat(mat);
        sg.getPrint();
    }
}
