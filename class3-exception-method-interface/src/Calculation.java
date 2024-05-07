
public class Calculation extends Formula implements I1, I2 {

    void msg(String MSG) {
        System.out.println("From child of Abstract class and Msg is " + MSG);
    }

    double areaOfCir(double rid) {
        return Math.PI * rid * rid;
    }

    double areaOfCir(int rid) {
        return Math.PI * rid * rid;
    }

    public int A_Square(int x) {
        return x * x;
    }

    public double A_tri(double l, double b) {
        return 0.5 * l * b;
    }

}
