public class EuclidianGcdAlgo {
    public static void main(String[] args) {
        int x = euclidianGcdOf(24,36);
        System.out.println(x);
    }
    public static int euclidianGcdOf(int n, int m){
        while(n!=0 && m!=0){
            if(n>m){
                n%=m;
            }
            else{
                m%=n;
            }
        }
        if(n==0) return m;
        else if (m==0) return n;

        return m;
    }
}