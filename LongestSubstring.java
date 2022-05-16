import java.util.Scanner;
import java.util.regex.Pattern;

public class LongestSubstring {
    int longSubstringWithoutRepeatingChar(String s) {
        int l = s.length();
        String t = "";
        int ptr = 0;
        int len=0;
        while(ptr<l) {
            t="";
            for(int j = ptr;j < l;j++) {
                if(t.contains(""+s.charAt(j)))
                    break;
                t+=s.charAt(j);
            }
            len = (t.length()>len)?t.length():len;
            ptr++;
        }
        return len;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new LongestSubstring().longSubstringWithoutRepeatingChar(s));
    }
}
