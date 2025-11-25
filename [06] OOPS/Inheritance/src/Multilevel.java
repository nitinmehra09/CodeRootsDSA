

class vehical{
    public void UsedToTravel(){
        System.out.println("Treveling...");
    }
}
class car extends vehical{
    public void havingFourWheels(){
        System.out.println("Have Four wheels");
    }
}
class bus extends car{
    public void capacity() {
        System.out.println("Carries many passengers");
    }
}
public class Multilevel{
    public static void main(String[] args) {
        System.out.println("This is car ");
        car c = new car();
        c.havingFourWheels();
        c.UsedToTravel();
        System.out.println("This is bus ");
        bus b1 = new bus();
        b1.UsedToTravel();
        b1.havingFourWheels();
        b1.capacity();   
    }
}
