import java.util.Scanner;

public class ClimbingStairs {
    int climbStairs(int n) {
        int x=1,y=2,z=0,i=0;
        if(n==1 || n==2)
            return n;
        while(i<n-2) {
            z=x+y;
            x=y;
            y=z;
            i++;
        }
        return z;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new ClimbingStairs().climbStairs(n));
    }
}
