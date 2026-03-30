package method;

public class Examples {
    public static void methodOverloading() {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.5, 2.5));

    }
    public static void passByValue() {
        int x=10;
        System.out.println(doubleNumber(x));

    }
    public static void passByReference() {
        // numbers(reference/address)------->{1,2,3,4,5}
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[0]);//1
        int[] doubleN= doubleNumber(numbers);
        System.out.println(numbers[0]);//1
        System.out.println(doubleN[0]);//2

    }
    public static int[] doubleNumber(int[] x) {
        //int[] others = numbers.clone();
        for(int i=0; i < x.length; i++ ) {
            x[i] = x[i] * 2;
        }
        return x;
    }
    public static int doubleNumber(int x) {
        x=x*2;
        System.out.println(x);
        return x;
    }
    public static double add (double x, double y) {
        return x+y;
    }
    public static int add(int x, int y) {
        return x+y;
    }
    public static int add(int x, int y, int z) {
        return x+y+z;
    }

    public static void orderExample(String name, int age) {
        System.out.println(name + ", age is " + age);
    }
    public static void orderExample(int age, String name) {
        System.out.println(name + ", age is " + age);
    }

}
