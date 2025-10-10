public class basicString {
    public static void main(String[] args) {
        // String name="Hello world";
        // System.out.println(name);

        // String a = new String("Hello");
        // System.out.println(a);

        // String b = new String("Hello");
        // System.out.println(b);

        // if(a==b){
        //     System.out.println("Yes");

        // }else{
        //     System.out.println("No");
        // }

        // // for value 
        // if(a.equals(b)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        String a = new String("Hello");
        String b = a;
        System.out.println(a +"And"+ b);
        b = "Not Hello";
        System.out.printf("a =%s and b = %s",a,b);
        
    }
}
