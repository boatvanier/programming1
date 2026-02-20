package varaibles;

public class StringExample {
    public static void show() {
        //        // String created using String literal
//        String s1 = "TAT";
//        String s2 = "TAT";
//
//        System.out.println(s1==s2);
//
//        // String created using 'new' keyword
//        String s3 = new String("TAT");
//        String s4 = new String("TAT");
//        String s5 = s4;
//
//        System.out.println(s1==s3);
//        System.out.println(s3==s4);
//
//        System.out.println(s1.equals(s3));

        // String methods
//        String s = "Java";
//        System.out.println("the length is: " + s.length()); // 4
//        System.out.println(s.charAt(0)); // 'J'
//        System.out.println(s.substring(0,3)); // from index 0 to index 3-1
//        System.out.println(s.substring(2));
//
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//
//        System.out.println(s.equals("java"));
//        System.out.println(s.equalsIgnoreCase("java"));
//
//        System.out.println(s.contains("lo"));
//        System.out.println(s.startsWith("Ja"));
//        System.out.println(s.endsWith("ld"));
//
//        System.out.println(s.replace("i", "X"));
//
//        String s1 = " ja va ";
//        System.out.println(s1.length());
//        String s1Trim = s1.trim();
//        System.out.println(s1Trim);
//        System.out.println(s1Trim.length());
//        System.out.println(s1Trim.replace(" ", ""));
//
//        String s2 = "it is a boy";
//        System.out.println(s2.trim());
//
//        String data = "apple,banana,orange";
//        String[] arr = data.split(","); //["apple", "banana", "orange"]
//        for(String a: arr) {
//            System.out.println(a);
//        }

//        String name = " ";
//        System.out.println(name.isEmpty());
//        System.out.println(name.isBlank());

        String name = "Alice";
        int age = 20;
        System.out.println(String.format("My name is %s.%nI am %d years old.", name, age));
    }
}
