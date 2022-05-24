import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i=0;i<(int)s.length/2;i++) {
            char t = s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=t;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        new ReverseString().reverseString(s.toCharArray());
    }
}
