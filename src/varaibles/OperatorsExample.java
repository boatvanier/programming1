package varaibles;

public class OperatorsExample {
    public static void show() {
        //        final int AGE = 4;
//        int result = AGE * 3;
//        System.out.println(result);
//        result = AGE * 4;
//        System.out.println(result);

        // Java Type promotion
//        short x = 5;
//        short y = 10;
//        int resultInt = x+y;
//        short result = (short) (x+y);
//
//        System.out.println(result);
//
//        int xi = 5;
//        double yi = 2;
//        double resultxy = xi+yi;
//        System.out.println(resultxy);
//
//        float xf = 5.5f;
//        double yf = 2.0;
//        double resultxyf =xf-yf;
//        System.out.println(resultxyf);
//
//        double xd = 5.5;
//        int yd = (int)xd;

//        System.out.println("Total: " + 10 + 5);
//        System.out.println("Total: " + (10+5));
//        System.out.println(10 + 5 + " is Total");
//
//        int resultNegative = 5 -10;
//        System.out.println(resultNegative);

//        long x2 = 1000000000*1000000000L;

        // int division truncate not round
//        double a = 5;
//        int b = 2;
//
//        System.out.println(a/b);

        //int c = 10/0;
//        double d = 0.0/0; // NaN
//        double e = 10.0/0; // infinity
//        System.out.println(d);
//        System.out.println(Double.isNaN(d));
//        System.out.println(Double.isInfinite(e));
//        System.out.println(Math.sqrt(-1));

//        System.out.println(10%2); // 3...1
//        System.out.println(2 + 3 * 4); //14
//        System.out.println((2 + 3) * 4); //20

//        Integer f = 500;
//        System.out.println(f);
//        System.out.println(f=600);
//        System.out.println(f==700);
//
//        String s = new String("Java");
//        System.out.println(!"Java".equals(s));
//
//        int g = 10;
//        System.out.println(g >= 10);
//
//        System.out.println(4 < 3 + g);// true

//        //&& logical and, || logical or, ! logical not
//        int age = 17;
//        boolean hasId = true;
//        System.out.println(age >= 18 && hasId);
//        System.out.println(age >= 18 || hasId);
//        System.out.println(!(age>=18));
//        System.out.println(!hasId);

        // 1,!-> 2,&& -> 3,||
//        System.out.println(true||false&&false);

        String s = "Hi";
        s += " Bo"; // s = s + " Bo"
        System.out.println(s);

        int a =10;
        a += 5; // a = a+5 // 15
        System.out.println(a);

        a -= 5; // a = a - 5; // 10
        System.out.println(a-5);

        a *= 2; // a = a*2
        System.out.println(a);

        a /= 4; // a = a/4
        System.out.println(a);
    }
}
