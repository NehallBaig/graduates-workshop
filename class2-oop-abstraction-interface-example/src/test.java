
public class test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.sum(14, 12)); // From A to B
        System.out.println(b.sub(12, 5));  // From B to B
        System.out.println(b.mult(4, 6));  // From A defined in B
        System.out.println(b.avg(23, 4));  // From I1 defined in B
        System.out.println(b.div(23, 4));  // From I2 defined in B
        //	A a =new A();  because of abstraction Object is not allowed
        //System.out.println(a.sum(13, 45));
    }
}
