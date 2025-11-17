
import java.util.Stack;

public class nextLargerElement {
    public static void main(String[] args) {
        int arr[] ={2,1,7,11,12,3,6,9};
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i =arr.length-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
                stack.push(arr[i]);
            }else{
                ans[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");
        }
    }
}
