public class Answer8 {

    public static  int rank(Integer[] arr,int x){
        int rnk = 0;
        for(int i = 0 ;i  < arr.length;i++){
            if(arr[i] <= x){
                rnk++;
            }
        }
        return rnk;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{ 10, 20, 15, 3, 4, 4, 1 };
        System.out.println(rank(arr,4));
    }
}
