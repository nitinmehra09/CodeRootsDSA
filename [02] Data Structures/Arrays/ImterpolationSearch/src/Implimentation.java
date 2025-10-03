public class Implimentation {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,14,20,24,28,30,32};
        int index = interpolationSearch(a,20);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int interpolationSearch(int a[],int x){
        int s = 0;
        int e = a.length-1;
        if(a[s]==a[e]){
            if(a[s]==x){
                return s;
            }
            return -1;
        }
        while(s<=e){
            int pos = s+(x-a[s])*(e-s)/(a[e]-a[s]);
            if(a[pos]==x){
                return pos;
            }else if(a[pos]>x){
                e=pos-1;
            }else{
                s=pos+1;
            }
        }
        return -1;
    }
}
