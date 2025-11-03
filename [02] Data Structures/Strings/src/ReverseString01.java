public class ReverseString01{
    public static void main(String[] args){
        String str = "abcdef";
        String ans = "";
        for (int i=0;i<str.length();i++){
            ans = str.charAt(i)+ ans;
        }
        System.out.println(ans);
    }
}