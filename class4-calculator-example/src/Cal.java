
public class Cal {
    private int mass;
    private int acc;

    Cal() {
        System.out.println("MSg IU 1");
    }

    Cal(String msg) {
        System.out.println(msg);
    }

    Cal(int mass, int acc) {
        this.mass = mass;
        this.acc = acc;
    }

    int Force() {
        return mass * acc;
    }

    int sum(int x, int y) {
        return x + y;
    }

    //int sum(int a,int b)
    //{
    //	return a+b;
    //}

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    double sum(double x, double y) {
        return x + y;
    }

    int sum(int x, double y) {
        return x + (int) y;
    }

    //int sum(double x,int y)
    //{
    //return (int)x+y;
    //}

    double sum(double x, int y) {
        return x + (double) y;
    }

    //String sum(double x,int y)
    //{
    //	String s="";
    //	return s;
    //}

    int[] sum(int[] x, int[] y) {
        int[] z = new int[x.length];
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                z[i] = x[i] + y[i];
            }
        }
        return z;

    }
}
