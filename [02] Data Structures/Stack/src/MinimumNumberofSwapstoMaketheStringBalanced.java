import java.util.Stack;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    public int minSwaps(String s) {
        Stack <Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    stack.push(ch);
                }else{
                    char top = stack.peek();
                    if(ch == ']' && top!='['){
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        int x = stack.size();
        int noOfOpen = x/2;
        return (noOfOpen+1)/2;
    }
}
