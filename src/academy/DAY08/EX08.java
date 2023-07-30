package academy.DAY08;

abstract class HyperCar {
    public abstract void HyperCarRun();
}

class Bugatti extends HyperCar {
    @Override
    public void HyperCarRun() {
        System.out.println("SuperCar Bugatti Run!");
    }
}

class Laferrari extends HyperCar {
    @Override
    public void HyperCarRun() {
        System.out.println("SuperCar Laferrari Run!");
    }
}

class Drive {
    public void drive(HyperCar hyperCar) {
        hyperCar.HyperCarRun();
    }
}

public class EX08 {
    public static void main(String[] args) {
        Drive driver = new Drive();

        HyperCar bugatti = new Bugatti();
        driver.drive(bugatti); // 출력: SuperCar Bugatti Run!

        HyperCar laferrari = new Laferrari();
        driver.drive(laferrari); // 출력: SuperCar Laferrari Run!
    }
}
