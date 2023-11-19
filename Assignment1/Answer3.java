public class Answer3 {
    public static int binSear(Integer [] arr, int key){
        int start = 0,end = arr.length-1;
        int numcmp = 0;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return numcmp;
            }else if(arr[mid] > key){
                start = mid+1;
            }else{
                end = mid - 1;
            }
            numcmp++;
        }
        return numcmp;
    }

    public static int linSear(Integer [] arr , int key){
        int numcmp = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == key){
                return numcmp;
            }else{
                numcmp++;
            }
        }
        return numcmp;
    }

    public static void main(String[] args) {
        Integer []arr = new Integer[]{1,2,3,4,5,6,7,8,9};
        System.out.println(linSear(arr,6));
        System.out.println(binSear(arr,6));
    }
}
