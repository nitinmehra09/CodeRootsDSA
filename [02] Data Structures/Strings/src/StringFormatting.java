public class StringFormatting {
    public static void main(String[] args) {
        String name = "Nitin Mehra";
        int age = 19;
        System.out.printf("Name = %s and age = %d",name,age);
        System.out.println("");
        String str = String.format("name = %s and age = %d",name, age);
        System.out.println(str);
    }
}
