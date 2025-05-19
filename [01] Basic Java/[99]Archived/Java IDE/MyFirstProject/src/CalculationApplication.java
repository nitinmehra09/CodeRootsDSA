import java.util.Scanner;
class CalculationApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculationApplication obj = new CalculationApplication();
        do{
            System.out.println("Enter Operator : (+,-,*,/,% ) ");
            char ch = sc.next().charAt(0);
            if(ch=='+'||ch=='-' ||ch=='*'||ch=='/'||ch=='%'){
                obj.chooseOperation(ch,sc);
            }else{
                System.out.println("Invalid operation");
            }
            boolean exit = obj.exitProgram(sc);
            if(exit){
                break;
            }
        }while(true);
        System.out.println("Thank you for using this application");
    }
    public boolean exitProgram(Scanner sc) {
        int retry = 5;
        for (int times = 0; times < retry; times++) {
            System.out.println("Do you want to continue? (y/n)");
            String input = sc.next();
            if (input.length() == 1) {
                char ch = input.charAt(0);
                if (ch == 'n' || ch == 'N') return true;
                if (ch == 'y' || ch == 'Y') return false;
            }
            System.out.println("Wrong input, please try again");
        }
        System.out.println("Maximum retry count exceeded! Exiting forcefully");
        return true;
    }
    public void chooseOperation(char ch,Scanner sc){
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (ch){
            case '+':
                System.out.println("Sum of two numbers is : "+(a+b));
                break;
            case '-':
                System.out.println("Difference of two numbers is : "+(a-b));
                break;
            case '*':
                System.out.println("Product of two numbers is : "+(a*b));
                break;
            case '/':
                System.out.println("Quotient of two numbers is : "+(a/b));
                break;
            case '%':
                System.out.println("Remainder of two numbers is : "+(a%b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}