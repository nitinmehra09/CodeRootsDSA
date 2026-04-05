import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String n = "96";

        System.out.println("Is " + n + " is Strobogrammatic? " + is_Strobogrammatic(n));
    }

    public static boolean is_Strobogrammatic(String s){
        HashMap<Character,Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                return false;
            }
            arr[i] = map.get(arr[i]);
        }
        int left = 0, right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return s.equals(new String(arr));
    }
}