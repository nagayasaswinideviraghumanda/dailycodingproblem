import java.util.Scanner;

public class HasAllCodes {
    public boolean hasAllCodes(String s,int k) {
        if (Math.pow(2,s.length()) < Math.pow(2, k))
            return false;
        boolean flag = true;
        for (int i = 0; i < Math.pow(2, k); i++) {
            String str = Integer.toBinaryString(i);
            str = "0".repeat(k - str.length()) + str;
            if (!s.contains(str)) {
                flag = false;
                break;
            }
        }
        return flag;
    }



    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(new HasAllCodes().hasAllCodes(s,k));
    }
}
