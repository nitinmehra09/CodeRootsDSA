public class CharacterConversion {
    public static void main(String[] args) {
        toLowerCase('A');
        toUpperCase('a');
    }
    public static void toLowerCase(char ch){
        ch = (char)(ch | ' ');
        System.out.println(ch);
    }
    public static void toUpperCase(char ch){
        ch = (char)(ch & '_');
        System.out.println(ch);
    }
}