import java.util.Scanner;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String s1="";
        boolean match=true;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                s1+=Character.toString((int)s.charAt(i)+32);
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                s1+=(s.charAt(i));
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                s1+=s.charAt(i);
            else
                continue;
        }

        int l = s1.length();
        for(int i=0;i<(int)l/2 && match;i++) {

            if(s1.charAt(i)==s1.charAt(l-i-1))
                continue;
            else
                match=false;
        }
        return match;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }
}
