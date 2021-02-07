import java.util.*;

public class balancedBrackets {

	public static void main(String[] args) {
		System.out.println(isBalanced("{[()]}"));
	}

    static String isBalanced(String s) {
        String opens = "({[";
        String pairs = "(){}[]";
        Stack <Character> stack = new Stack <Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (opens.indexOf(c) >= 0) {
                stack.push(c);
            }
            else {
                String pair = stack.pop() + "" + c;
                if (!pairs.contains(pair)) {
                    return "NO";
                }
            }
        }
        //there is one remaining?
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
        
    }
}
