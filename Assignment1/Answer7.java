import java.util.*;

public class Answer7 {
    public static int fn(Integer[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            hs.put(arr[i] , hs.getOrDefault(arr[i],0) +1);
        }
        for(Integer i : arr){
            if(hs.get(i) == 1)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,4,13,21,21,2,3,1};
        System.out.println(fn(arr));
    }
}
