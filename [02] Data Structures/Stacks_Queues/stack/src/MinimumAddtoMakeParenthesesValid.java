import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    stack.push(ch);
                }else{
                char top = stack.peek();
                if(ch == '}' && top!='{'){
                    stack.push(ch);
                }
                else if(ch == ']' && top!='['){
                    stack.push(ch);
                }
                else if(ch == ')' && top!='('){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }}
        }
        return stack.size();

    }
}
