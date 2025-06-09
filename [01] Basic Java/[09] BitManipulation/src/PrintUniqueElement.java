public class PrintUniqueElement {
    public static void main(String[] args) {
        int n[] = {1,1,4,3,4,2,2,5,5};
        int x = findUniqueElement(n);
        System.out.println("Unique element is : "+x);
    }
    public static int findUniqueElement(int n[]){
        int res = 0;
        for(int i =0;i<n.length;i++){
            res = res ^ n[i];
        }
        return res;
    }
}