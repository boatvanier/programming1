package regex;

import java.util.Scanner;

public class RegexLab {
//    1. Match exactly 5 digits
//    \d{5}
//    java: "^\\d{5}$"
//
//    2, Match a username
//    [a-zA-z]\w{4,11}
//    java: "^[a-zA-z]\\w{4,11}$"
//
//    3, Match words ending with "ing"
//    \w+ing
//    java: "^\\w+ing$"
//
//    4, Match dates YYYY-MM-DD
//    \d{4}-\d{2}-\d{2}
//    java: "^\\d{4}-\\d{2}-\\d{2}"
//
//    5, Password(at least 8 chars, 1 digit, 1 uppercase)
//    (?=) positive lookahead, it checks if the pattern exists ahead in the string
//    (?=.*[A-Z])(?=.*\d).*{8,}
//    java: "^(?=.*[A-Z])(?=.*\\d).*{8,}$"
//
//    6, Match hex color code
//    #([A-Fa-f0-9]{6})
//    java: "^#([A-Fa-f0-9]{6})$"

    public static void q7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Id: ");
        String studentId = sc.nextLine();
        if (studentId.matches("S\\d{5}")) {
            System.out.println("Valid");
        }else{
            System.out.println("invalid");
        }
        sc.close();
    }
    public static void q8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        if (s.isBlank()) {
            System.out.println("Empty!");
        }else{
            System.out.println(s.replaceAll("\\s+", " "));
        }
        sc.close();
    }

    public static void q9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        if (email.matches("[A-Za-z0-9._]+@[A-Za-z0-9]+\\.(com|net|org)")) {
            System.out.println("Valid email");
        }else{
            System.out.println("invalid email");
        }
        sc.close();

    }

}
