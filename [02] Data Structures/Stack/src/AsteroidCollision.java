import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int arr[] = {10,2,-5,4,-10,20,30,-40,40};
        int ans [] = asteroidCollision(arr);
         System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i != ans.length - 1) System.out.print("\t");
        }
        System.out.println("]");
    }
    public static int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<arr.length; i++){
            if(stack.isEmpty() || arr[i]>0){
                stack.push(arr[i]);
            }
            else{
                while (!stack.isEmpty() && arr[i] < 0) {
                    int top = stack.peek();
                    if(top<0){ 
                        stack.push(arr[i]); 
                        break;
                    }
                    int modval = Math.abs(arr[i]);
                    if(modval==top){
                        stack.pop();
                        break;
                    }else if (modval<top) {
                        break;
                    }else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int ans[] = new int[stack.size()];
        for(int i =stack.size()-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}