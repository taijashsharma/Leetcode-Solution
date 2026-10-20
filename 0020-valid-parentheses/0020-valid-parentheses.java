import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Agar opening bracket hai, toh Stack me push karo
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Agar closing bracket hai
            else {
                // Agar stack khali hai, iska matlab bina opening ke closing aa gaya
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Match check karo
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // Agar saare brackets validly close hue hain, toh stack khali hona chahiye
        return stack.isEmpty();
    }
}