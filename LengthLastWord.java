import java.util.Scanner;

public class LengthLastWord {
    int lengthOfLastWord(String s) {
        s=s.trim();
        String t = "";
        for(int i = s.length()-1;i>=0;i--) {
            if(s.charAt(i)==' ')
                break;
            t = s.charAt(i) + t;
        }
        return t.length();
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new LengthLastWord().lengthOfLastWord(s));

    }
}
