package academy.DAY08;

class Ferrari2 {
    protected int year;
    public Ferrari2(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void speed() {
        System.out.println(getYear() + "년식 페라리 최대 속도 : 300KM");
    }
}

class NewFerrari extends Ferrari2 {
    public NewFerrari(int year) {
        super(year);
    }
    @Override
    public void speed() {
        if (super.year == 2023) {
            System.out.println(getYear() + "년식 페라리 최대 속도 : 400KM");
        }
        else {
            super.speed();
        }
    }
}

public class EX04_02 {
    public static void main(String[] args) {
        NewFerrari myNewCar1 = new NewFerrari(2023);
        myNewCar1.speed();
        NewFerrari myNewCar2 = new NewFerrari(2021);
        myNewCar2.speed();

    }
}
