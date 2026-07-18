public class program07 {
    int reverseNumber(int n,int i){
        if(i==0) return n;
        return (int)(n%10 * Math.pow(10,i)) + reverseNumber(n/10,--i);
    }

    int sum = 0;
    void reverseNumber2(int n){
        if(n<=0) return;
        sum =sum*10 + n%10;
        reverseNumber2(n/10);
    }


    public static void main(String[] args) {
        int n = 567349;
        program07 p = new program07();
        int ans = p.reverseNumber(n,(int)(Math.log10(n)));
        p.reverseNumber2(n);
        System.out.println(p.sum);
        System.out.println(ans);
    }
}
