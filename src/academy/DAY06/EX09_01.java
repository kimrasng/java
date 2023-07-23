package academy.DAY06;

class Car1 {
    String company = "제네시스";
    String model = "GV90";
    String color = "white";
    int maxSpeed = 200;
    int currentSpeed;
    boolean enginStart;
}
public class EX09_01 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        System.out.println(car.company);
    }
}
