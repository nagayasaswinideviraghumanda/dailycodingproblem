import java.util.Arrays;
import java.util.Scanner;

public class ReverseVowelsOfStr {
    public String reverseVowels(String s) {
        String str = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        String t="";
        for(int i=0;i<ch.length;i++) {
            if(str.indexOf(ch[i])!=-1)
                t=s.charAt(i)+t;
        }
        int k=0;
        for(int i=0;i<ch.length;i++) {
            if(str.indexOf(ch[i])!=-1) {
                ch[i]=t.charAt(k);
                k+=1;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new ReverseVowelsOfStr().reverseVowels(s));
    }
}
