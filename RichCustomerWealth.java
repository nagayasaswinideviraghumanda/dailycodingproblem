import java.util.Scanner;

public class RichCustomerWealth {
    int richestCustomerWealth(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int max = 0;
        for(int i = 0;i<r;i++) {
            int res = 0;
            for(int j = 0;j<c;j++)
                res+=arr[i][j];
            max = max>res?max:res;
        }
        return max;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0;i<r;i++) {
            for(int j = 0;j<c;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(new RichCustomerWealth().richestCustomerWealth(arr));

    }
}
