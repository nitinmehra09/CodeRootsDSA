public class stringImmutability {
    public static void main(String[] args) {
        String name1 = new String("Nitin");
        String name2 = name1;
        System.out.printf("name1 = %s And name2  = %s",name1,name2);
        System.out.println("After change");
        name2 = "HELLO";
        System.out.printf("name1 = %s and name2 = %s ",name1,name2);
    }

}
