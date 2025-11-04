public class AnagramString {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "dcboe";
        if(a.length()!=b.length()){
            System.out.println("No, it is not anagram");
            return;
        }
        boolean f = anagram(a, b);
        if(f){
            System.out.println("Yes, it anagram");
        }else{
            System.out.println("No, it is not anagram");
        }
        
    }
    public static boolean anagram(String a , String b) {
        int arr[] = new int[26];
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            int indexA = ch-97;
            arr[indexA] +=1;
            char ch2 = b.charAt(i);
            int indexB = ch2-97;
            arr[indexB] -=1;
        }
        for (int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
