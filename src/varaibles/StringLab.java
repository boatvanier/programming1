package varaibles;

public class StringLab {
    public static void show() {
        String data = "  John Doe,18,Java Programming  ";

        // Step 1: Trim
        System.out.println("Original length: " + data.length());

        data = data.trim();
        System.out.println("Trimmed length: " + data.length());

        // Step 2: Call split but do not use array
        String[] arr = data.split(",");

        // Step 3: Extract using indexOf + substring
        int firstComma = data.indexOf(",");
        int secondComma = data.indexOf(",", firstComma + 1);

        String name = data.substring(0, firstComma);
        String ageStr = data.substring(firstComma + 1, secondComma);
        String course = data.substring(secondComma + 1);

        int age = Integer.parseInt(ageStr);

        // Name operations
        System.out.println("Name length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("First 4 letters: " + name.substring(0, 4));
        System.out.println("Last name: " + name.substring(name.indexOf(" ") + 1));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Course operations
        System.out.println("Equals 'java programming': " + course.equals("java programming"));

        System.out.println("EqualsIgnoreCase: " + course.equalsIgnoreCase("java programming"));

        System.out.println("Contains 'Java': " + course.contains("Java"));

        System.out.println("Starts with 'Java': " + course.startsWith("Java"));

        System.out.println("Ends with 'ing': " + course.endsWith("ing"));

        System.out.println("Replace 'a' with '@': "
                + course.replace("a", "@"));

        // Final formatted output
        String result = String.format("Name: %s, Age: %d", name, age);
        System.out.println(result);
    }
}
