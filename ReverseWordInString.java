import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordInString {
    public String reverseWords(String s) {
        String t = "";
        String[] words = s.split(" ");
        for(int i=0;i< words.length;i++) {
            if(words[i].trim().length()==0)
                continue;
            else
                t=words[i]+" "+t;
        }
        return t.trim();
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new ReverseWordInString().reverseWords(s));
    }
}
