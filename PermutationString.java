import java.util.Scanner;

public class PermutationString {
    String swap(String s,int i ,int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }

    void palindrome(String str,int left,int right) {
        if(left==right)
            System.out.println(str);
        else {
            for(int i = left;i<=right;i++) {
                String s = this.swap(str,left,i);
                palindrome(s,left+1,right);
            }
        }

    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        new PermutationString().palindrome(s,0,s.length()-1);



    }
}
