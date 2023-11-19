public class Answer1 {
    public static boolean func1(StringBuffer s){
        StringBuffer sb = s;
        s.reverse();
        return sb.compareTo(s) == 0;
    }

    public static boolean func2(StringBuffer s){
        int i = 0, j = s.length() -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }



    public static void main(String[] args) {

    }
}
