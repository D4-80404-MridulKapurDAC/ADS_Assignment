import java.util.Stack;

public class Main {
    public static int priority(char opr) {
        switch(opr) {
            case '$': return 10;
            case '/':
            case '%':
            case '*':
                return 9;
            case '+':
            case '-':
                return 8;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(priority('*'));
    }
}