import java.util.Arrays;

public class Main {
    public static void selSort(int[] nums){
        int comp=0;
        for(int i=1;i<nums.length;i++){
            int x=nums[i],j=i-1;
            while (j>=0 && nums[j]<x){
                comp++;
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=x;
        }
        System.out.println("Comparisons :"+comp);

    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        selSort(nums);
        for (int x:nums) {
            System.out.print(x+" ");
        }
        //System.out.println(Arrays.toString(nums));
    }
}
