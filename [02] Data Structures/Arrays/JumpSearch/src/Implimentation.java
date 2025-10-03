public class Implimentation {
    public static void main(String[] args) {
       int a[] = {10,20,30,40,55,66,77,89,100};
        int index = jumpSearch(a,100);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int jumpSearch(int a[], int x){
        int blockSize = (int)Math.floor(Math.sqrt(a.length));
        int s=0;
        int e=blockSize;
        while(e<a.length && a[e - 1]<x){
            s=e;
            e=e+blockSize;
        }
        if(e>=a.length){
            e=a.length-1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==x){
                return mid;
            }else if(a[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
