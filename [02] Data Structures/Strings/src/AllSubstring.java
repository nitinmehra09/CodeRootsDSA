public class AllSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i =0;i<str.length();i++){
            int j=i;
            while(j<str.length()){
                System.out.println(str.substring(i, j+1));
                j++;
            }
        }
    }
}