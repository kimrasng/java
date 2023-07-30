package academy.DAY08;

class ParentClass {
    public String parent;

    public void ParentRun() {
        System.out.println("Parents Class Run!");
    }
}

class ChildClass extends ParentClass {
    public String child;

    public void ChildRun() {
        System.out.println("Child Class Run!");
    }
}

public class EX09 {
    public static void main(String[] args) {
        ParentClass parent = new ChildClass();
        parent.parent = "부모 클래스";
        System.out.println(parent.parent); // 출력: 부모 클래스
        parent.ParentRun(); // 출력: Parents Class Run!
        System.out.println();

        ChildClass child = (ChildClass) parent; // 다운캐스팅
        child.child = "자식 클래스";
        System.out.println(child.child); // 출력: 자식 클래스
        child.ChildRun(); // 출력: Child Class Run!
    }
}
