import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSets {
    List<List<Integer>> subSets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lt = new ArrayList<List<Integer>>()

        for(int i=0;i<Math.pow(2,n);i++) {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++) {
                if((i & (1<<j))!=0)
                    l.add(nums[i]);
            }
            lt.add(l);
        }
        return lt;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(new SubSets().subSets(arr));

    }
}
