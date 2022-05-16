import java.util.Scanner;

public class ContainerMaxWater {
    int containerWithMaxArea(int[] arr) {
        int left = 0, right = arr.length-1,water=0;
        while(left<right) {
            water = Math.max(water, Math.min(arr[left],arr[right])*(right-left));
            if(arr[left]>arr[right])
                right--;
            else
                left++;
        }
        return water;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(new ContainerMaxWater().containerWithMaxArea(arr));

    }
}
