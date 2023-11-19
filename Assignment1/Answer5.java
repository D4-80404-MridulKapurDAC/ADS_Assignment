public class Answer5 {
    public static int binSear(Integer[] arr,int key){
        int start = 0,end = arr.length;
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid] == key)return mid;
            else if (arr[mid] > key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
