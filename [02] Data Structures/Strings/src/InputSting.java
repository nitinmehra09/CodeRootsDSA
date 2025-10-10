
import java.util.Scanner;

public class InputSting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st word : ");
        String word1 = sc.next();
        System.out.println("Enter 2nd Word : ");
        String word2 = sc.next();
        System.out.println("Enter 1st Line : ");
        String line1 = sc.nextLine();
        System.out.println("Enter 2nd Line : ");
        String line2 = sc.nextLine();

        System.out.printf("Word1 = %s\n word2 = %s \nLine1 = %s \nline2= %s",word1,word2,line1,line2);

    }
}
