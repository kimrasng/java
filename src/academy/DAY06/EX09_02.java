package academy.DAY06;
class Car2 {
    String company = "제네시스";
    String model = "GV90";
    String color = "white";
    int maxSpeed = 200;
    int rpm;
    int currentSpeed;
    boolean enginStart;
}
public class EX09_02 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        System.out.println("제조 회사 : " + car.company);
        System.out.println("차 모델명 : " + car.model);
        System.out.println("색상 이름 : " + car.color);
        System.out.println("최대 속도 : " + car.maxSpeed);
        System.out.println("회전 속도 : " + car.rpm);
        System.out.println("현재 속도 : " + car.currentSpeed);
        System.out.println("시동 여부 : " + car.enginStart);

    }
}
