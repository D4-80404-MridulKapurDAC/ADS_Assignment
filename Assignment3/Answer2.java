import java.util.Arrays;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        Stack s=new Stack();
        for(int x: arr){
            s.push(x);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) s.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}