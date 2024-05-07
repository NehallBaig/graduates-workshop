
public abstract class Formula {

    abstract double areaOfCir(double rid);

    double force(double mass, double acc) {
        return mass * acc;
    }

    double energy(double mass) {
        double c = 300000000;
        return mass * c * c;
    }

}
