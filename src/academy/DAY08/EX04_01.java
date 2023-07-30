package academy.DAY08;

class Ferrari1 {
    private int year;
    public Ferrari1(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void speed() {
        System.out.println(getYear() + "년식 페라리 최대 속도 : 300KM");
    }
}

public class EX04_01 {
    public static void main(String[] args) {
        Ferrari1 myCar = new Ferrari1(2021);
        myCar.speed();
    }
}
