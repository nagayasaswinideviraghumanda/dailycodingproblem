package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMatch {
    boolean regex(String s1,String s2) {
        boolean b = Pattern.compile(s2).matcher(s1).matches();
        return b;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(new StringMatch().regex(s1,s2));
    }
}
