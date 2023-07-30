package academy.DAY08;

class Parents {
    public String str = "JAVA";
}

class Child extends Parents {
    public String str = "Class";
    public void printStr() {
        System.out.println("부모 객체 str : " + super.str);
        System.out.println("자식 객체 str : " + this.str);
    }
}

public class EX02 {
    public static void main(String[] args) {
        Child strTest = new Child();
        strTest.printStr();
    }
}
