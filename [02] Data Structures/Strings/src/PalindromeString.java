public class PalindromeString {
    public static void main(String[] args) {
        String str = "Nitip";
        String ans = "";
        for (int i=0;i<str.length();i++){
            ans = str.charAt(i)+ ans;
        }
        if(str.equalsIgnoreCase(ans)){
            System.out.println("Yes palindrome");
        }else{
            System.out.println("Non palindrome");
        }
    }
}
