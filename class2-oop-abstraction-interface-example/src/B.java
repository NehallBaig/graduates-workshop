public class B extends A implements I1, I2 {

    int sub(int x, int y) {
        return x - y;
    }

    @Override
    int mult(int x, int y)   // From A
    {
        return x * y;
    }

    @Override
    public double avg(double x, double y) {
        return (x + y) / 2;
    }

    @Override
    public double div(double x, double y) {
        // TODO Auto-generated method stub
        return x / y;
    }


}
