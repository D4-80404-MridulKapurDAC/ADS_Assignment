import java.util.Arrays;

public class Answer9 {

    public static int sel(Integer[] arr){
        int cmp = 0;
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                cmp++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return cmp;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{44,22,11,55,33};
        System.out.println(sel(arr));
    }

}
