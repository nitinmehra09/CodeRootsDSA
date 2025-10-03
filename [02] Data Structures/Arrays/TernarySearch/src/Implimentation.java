public class Implimentation {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,55,66,77,89,100};
        int index = ternarySearch(a,100);
        if(index!=-1){
            System.out.println("Element found at "+index);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int ternarySearch(int a[],int x){
        int index=-1;
        int s = 0;
        int e = a.length-1;
        while(s<=e){
            int mid1=s+(e-s)/3;
            int mid2=e-(e-s)/3;
            if (a[mid1] == x) {
                return mid1;
            }
            if (a[mid2] == x) {
                return mid2;
            }
            if(x<a[mid1]){
                e=mid1-1;
            }else if(x>a[mid2]){
                s=mid2+1;
            }else{
                s=mid1+1;
                e=mid2-1;
            }
        }
      return index;
    }
}
