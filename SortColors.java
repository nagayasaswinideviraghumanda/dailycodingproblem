import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j< nums.length;j++) {
                if(nums[i]>nums[j]) {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        new SortColors().sortColors(a);

    }
}
