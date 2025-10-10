public class StringFunction {
    public static void main(String[] args) {
        String s = new String("Hello I am Nitin Mehra");
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.charAt(6));
        // System.out.println(s.indexOf('a'));
        // System.out.println(s.length());
        // String s1 = "Sing";
        // String s2 = "SingWithMe";
        // // Compare to function
        // System.out.println(s1.compareTo(s2));

        // //SubString and subsquence 
        // String a = "abcdefghi";
        // System.out.println(a.substring(1));
        // System.out.println(a.subSequence(3,5));

        // // String spaceWalaWorld = "             nitin                  " ;
        // // System.out.println(spaceWalaWorld.strip());
        // // System.out.println(s.startsWith("Hello"));
        // // System.out.println(s.endsWith("Mehra"));

        // char ch[] = s.toCharArray();
        // for(int i = 0; i<ch.length;i++){
        //     System.out.print(ch[i]+"\t");
        // }

        String name3String[] = s.split(" ");
        for (String name3String1 : name3String) {
            System.out.print(name3String1 + "\t");
        }
    }
}
