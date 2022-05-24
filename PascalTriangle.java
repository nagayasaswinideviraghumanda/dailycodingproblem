import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    BigInteger fact(int n) {
        BigInteger f = new BigInteger("1");
        if(n==0 || n==1)
            return f;
        for(int i=2;i<=n;i++)
            f=f.multiply(BigInteger.valueOf(i));
        return f;

    }
    List<List<Integer>> generatePascal(int r) {
        List<List<Integer>> lt = new ArrayList<List<Integer>>();
        for(int i=0;i<r;i++) {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                BigInteger f;
                f = (fact(i)).divide((fact(j)).multiply(fact(i-j)));

                l.add(f.intValue());
            }

            lt.add(l);
        }
        return lt;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print(new PascalTriangle().generatePascal(r));
    }
}
