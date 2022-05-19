import java.util.Scanner;

public class ImplementStrstr {
    int strStr(String haystack,String needle) {
        if(needle.isEmpty())
            return 0;
        else
            return haystack.indexOf(needle);
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(new ImplementStrstr().strStr(a,b));

    }
}
