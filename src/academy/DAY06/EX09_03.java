package academy.DAY06;
class Car3 {
    String company = "제네시스";
    String model = "GV90";
    String color = "white";
    int maxSpeed = 200;
    int rpm;
    int currentSpeed;
    boolean enginStart;
}
public class EX09_03 {
    public static void main(String[] args) {
        Car3 car = new Car3();

        car.rpm = 3000;
        car.currentSpeed = 70;
        car.enginStart = true;

        System.out.println("엔진 시동 여부 : " + car.enginStart);
        System.out.println("현재 RPM : " + car.rpm);
        System.out.println("현재 속도 : " + car.currentSpeed);
    }
}
