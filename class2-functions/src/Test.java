
public class Test {
    int x, y;

    int sum(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    double fact(double v) {
        double ft;
        ft = 1;
        for (double i = 1; i <= v; i++) {
            ft = ft * i;
        }
        return ft;
    }

    double pow(double v, double p) {
        double ft;
        ft = 1;
        for (double i = 1; i <= p; i++) {
            ft = ft * v;
        }
        return ft;
    }


    double exp(double x) {
        Test t1 = new Test();
        double total;
        total = 0;
        for (double n = 0; n <= 39; n++) {
            total = total + (t1.pow(x, n) / t1.fact(n));
        }

        return total;
    }


}
