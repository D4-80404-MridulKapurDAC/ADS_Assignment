public class Answer6 {
    public static int linSear(Integer[] arr, int key,int occ){
            int cnt = 0;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]==key){
                    cnt++;
                    if(cnt == occ){
                        return i;
                    }
                }
            }
            return -1;
    }

    public static void main(String[] args) {

    }
}
