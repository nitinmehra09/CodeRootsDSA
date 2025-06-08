import java.util.Arrays;
public class EratosthenessieveAlgorithm {
    public static void main(String[] args) {
        sieveAlgorithm(40);
    }
    public static void sieveAlgorithm(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter<=num){
            if(arr[counter] == true){
                for(int factor = counter+counter; factor<=num; factor+=counter){
                    arr[factor] = false;
                }
            }
            counter++;
        }
        int x = 0;
        for(int i=2;i<=num;i++){
            if (arr[i]==true){
                x +=1;
            }
        }
        System.out.println(x);
    }
}