
public class test {
    public static void main(String[] arg) {

        Calculation t1 = new Calculation();
        System.out.println(t1.energy(12.98));
        System.out.println(t1.force(12.67, 19.8));
        t1.msg("Check");

        int[] A = new int[5];
        try {
            for (int a = 0; a < 10; a++) {

                // Un commented line 15 will throw java.lang.ArithmeticException: / by zero
                //System.out.println(10 / a);
                A[a] = a + 10;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e1) {
            System.out.println(e1);
        }

        // Use can be written both exception in single catch block
        // catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {

    }


}
