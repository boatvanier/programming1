package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class samples {
    public static void show(){
        System.out.println("12345".matches("\\d+"));
        System.out.println("1234d".matches("\\d+"));

        String email = "test@gmail.com";
        System.out.println(email.matches("\\w+@\\w+.com"));

                String s = "class room 102";
        System.out.println(s.replaceAll("\\d",""));
        String text = "Hello      world,again";
        System.out.println(text.replaceAll("\\s+", " "));

        Scanner sc = new Scanner("test,test;test  test");
        sc.useDelimiter("[,;\\s]+");
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        Pattern pattern = Pattern.compile("^\\w+$");
        Matcher matcher = pattern.matcher("room 102");
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("no matches");
        }

    }
}
