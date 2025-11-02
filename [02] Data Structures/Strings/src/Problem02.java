public class Problem02 {
    public static void main(String[] args) {
        // String email2 = "nitinmehra@gmail.com";
        String email1 = "nitinmehra@outlook.com";
        int s = email1.indexOf('@');
        int e = email1.indexOf(".");
        String brand = email1.substring(s+1, e);
        System.out.println("Brand of your email is"+": "+brand);
    }

}
