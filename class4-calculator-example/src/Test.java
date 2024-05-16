
public class Test {

    public static void main(String arg[]) {

		/*
			Cal c1 = new Cal(3, 100);
			System.out.println(c1.Force());
			Cal c2 = new Cal();
			////////////////////////////////

			System.out.println(c2.sum(12, 13));
			System.out.println(c2.sum(12.5, 13));
			c2.sum(12, 13.7);
			c2.sum(12.6, 19.7);
			c2.sum(12, 13, 15);
			int A[] = {1, 3, 5};
			int B[] = {7, 8, 9};
			int C[] = c2.sum(A, B);

			// System.out.println(c2.sum(A,B)[3]);

			System.out.println(C[0] + " " + C[1] + " " + C[2]);

		 */


        ClassA a1;
        //a1.subt(2, 5);
        //a1.increment(3);
        ClassB b1 = new ClassB();

		System.out.println(b1.subt(2, 4));
		System.out.println(b1.mult(12, 56));
		System.out.println(b1.div(13, 16));
		System.out.println(b1.MSG("Iqra"));
    }


}
