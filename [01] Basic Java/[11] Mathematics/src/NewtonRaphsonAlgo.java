public class NewtonRaphsonAlgo {
    public static void main(String[] args) {
        newtonRaphsonAlgorithm(4,4);
    }
    public static void newtonRaphsonAlgorithm(int n, int t){
        double X = n,root=0;
        for(int i =0;i<=t;i++){
            root = 0.5*(X + n/X);
            X = root;
        }
        System.out.println(root);
        
    }
}