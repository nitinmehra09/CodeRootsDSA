public class Problem01 {
    public static void main(String[] args) {
        String str = "hyderabad, chennai, bangalore, indore";
        String arr[] = str.split(", ");
        for(String arr1 : arr) {
            System.out.println(arr1);
        }
    }
}
