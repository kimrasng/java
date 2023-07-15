package DAY03;

import com.sun.deploy.security.SelectableSecurityManager;

public class Q4 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 1; max < 10000; i++) {
            if (i % 2 == 0)
                System.out.print();
                else
                    max += i;
        }
        System.out.println(max);
    }
}
