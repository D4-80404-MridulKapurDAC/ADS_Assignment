public class Answer2 {
    public static int lastIdx(Integer[] arr, int key){
        int res = -1;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == key){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,2,3,1,2,1,2,3,1,2,4,2,1,4};
        System.out.println(lastIdx(arr,4));
    }
}
