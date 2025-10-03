public class Implimentation {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,55,66,77,89,100};
        int index = exponentialSearch(a,100);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int exponentialSearch(int a[],int x){
        int range[] = findRange(a,x);
        int s =range[0];
        int e =range[1];
        while(s<=e){
            int mid =s+(e-s)/2;
            if(a[mid]==x){
                return mid;
            }else if(a[mid]<x){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static int[] findRange(int a[], int x){
        int range[] = new int[2];
        int s =0;
        int e=1;
        while(a[e]<x){
            s=e;
            e=2*e;
        }
        range[0] =s;
        range[1] =e;

        return range;
    }

}
