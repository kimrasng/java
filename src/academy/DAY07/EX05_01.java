package academy.DAY07;


import java.util.Scanner;

class SetGet_01 {
    private String name;
    private void setName() {
        Scanner input = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        this.name = input.next();
        input.close();
    }
    private String getName() {
        return this.name;
    }

    public void nameSetGet() {
        setName();
        System.out.println("이름 출력 : " + getName());
    }
}

public class EX05_01 {
    public static void main(String[] args) {
        SetGet_01 sg = new SetGet_01();
        sg.nameSetGet();
    }
}
