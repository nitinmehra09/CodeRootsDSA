class Problem01{
    void printNTo1(int n){
        if(n==0) return;
        System.out.println(n);
        printNTo1(--n);
    }

    public static void main(String[] args) {
        int n = 5;
        Problem01 p = new Problem01();
        p.printNTo1(n);
    }
}
