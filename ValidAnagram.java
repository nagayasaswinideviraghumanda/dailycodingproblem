import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s,String t) {
        int[] f = new int[26];
        int[] g = new int[26];
        for(int i=0;i<s.length();i++)
            f[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)
            f[t.charAt(i)-'a']--;
        return Arrays.equals(f,g);
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(new ValidAnagram().isAnagram(s,t));
    }
}
