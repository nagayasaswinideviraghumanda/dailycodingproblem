/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.*/
import java.util.Scanner;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        boolean flag = false;
        int n = nums.length;
        int[] ans = new int[2];
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums[i]+nums[j]==target) {
                    flag = true;
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        if(flag)
            return ans;
        else
            return null;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int target = sc.nextInt();
        System.out.println(new TwoSum().twoSum(arr,target));
    }
}
