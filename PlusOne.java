import jdk.jfr.Unsigned;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9) {
            digits[digits.length-1]+=1;
            return digits;
        }
        else {
            StringBuffer sb = new StringBuffer();
            for (int digit : digits) sb.append(digit);
            BigInteger bi = new BigInteger(sb.toString());
            BigInteger te = new BigInteger("1");
            BigInteger req = bi.add(te);
            String k = String.valueOf(req);
            int[] arr = new int[k.length()];
            for(int i=0;i<k.length();i++)
                arr[i]= Integer.parseInt(""+k.charAt(i));
            return arr;
        }
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(new PlusOne().plusOne(arr)));

    }
}
