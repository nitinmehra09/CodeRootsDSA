public class EnhanceSwitchCase {
    public static void main(String[] args) {
        int Day = 5; // Hardcoded for testing
        switch (Day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");    
            default -> System.out.println("Invalid");
        }
    }
}