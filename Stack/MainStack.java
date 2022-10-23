import java.util.ArrayDeque;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> Games = new Stack();
        Games.push("Cyberpunk");
        Games.push("Witcher");
        Games.push("Pokemon");
        Games.push("Zelda");
        for (int i = 0; i < 3; i++) {
            System.out.println(Games.size());
            System.out.println(Games.peek());
            System.out.println(Games.pop());
        }

        ArrayDeque<Object> stack = null;
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
