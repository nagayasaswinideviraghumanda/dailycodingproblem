import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary,String sentence) {
        String[] k = sentence.split(" ");
        for(int i=0;i< k.length;i++) {
            int min = Integer.MAX_VALUE;
            for(String sub : dictionary) {
                if(k[i].startsWith(sub) && k[i].length()<min) {
                    k[i] = sub;
                }
            }
        }
        String t="";
        for(int i=0;i<k.length;i++)
            t=t+k[i]+" ";
        return t.trim();

    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String s = sc.nextLine();
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(sc.next());
        System.out.println(new ReplaceWords().replaceWords(l,s));

    }
}
