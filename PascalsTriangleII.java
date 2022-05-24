import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleII {
    BigInteger fact(int n) {
        BigInteger f = new BigInteger("1");
        if (n == 0 || n == 1)
            return f;
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;

    }
    List<Integer> generatePascal(int r) {
        List<Integer> l = new ArrayList<Integer>();
        BigInteger t ;
        for(int i=0;i<=r;i++) {
            t=(fact(r)).divide((fact(i)).multiply(fact(r-i)));
            l.add(t.intValue());
        }
        return l;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(new PascalsTriangleII().generatePascal(r));
    }


}
