package varaibles;

public class VariableLab {
    public static void show() {
        // Step 1: Primitives
        int age = 18;
        double height = 5.8;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student? " + isStudent);

        // Step 2: Non-Primitives
        String name = "Alice";
        System.out.println("Name: " + name);

        // Step 3: Wrapper Classes
        Integer ageWrapper = Integer.valueOf(age);       // wrap int
        Double heightWrapper = Double.valueOf(height);   // wrap double

        // Wrapper methods
        String ageStr = ageWrapper.toString();           // int → String
        int parsedAge = Integer.parseInt("25");          // String → int
        System.out.println("Age as String: " + ageStr);
        System.out.println("Parsed Age from String: " + parsedAge);

        // Character wrapper
        char ch = '7';
        System.out.println("Is '" + ch + "' a digit? " + Character.isDigit(ch));
        System.out.println("Is '" + ch + "' a letter? " + Character.isLetter(ch));

        // Step 4: Type Casting
        int x = 10;
        double y = x;       // implicit casting
        System.out.println("Implicit casting int to double: " + y);

        double z = 9.7;
        int w = (int) z;    // explicit casting
        System.out.println("Explicit casting double to int: " + w);

        double bigDouble = 12345.6789;
        int smallInt = (int) bigDouble;  // data loss example
        System.out.println("Data loss example: " + smallInt);

        // Step 5: Autoboxing / Unboxing
        Integer autoBox = 50;  // autoboxing
        int unBox = autoBox;    // unboxing
        System.out.println("Autoboxed Integer: " + autoBox);
        System.out.println("Unboxed int: " + unBox);
    }
}
