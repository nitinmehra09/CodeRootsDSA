class Car{
    String brand;
    String color;
    boolean isABSPresent;
    int speed;
    public Car(String brand, String color, boolean isABSPresent, int speed){
        this.brand = brand;
        this.color = color;
        this.isABSPresent = isABSPresent;
        this.speed = speed;
    }
    public void start(){
        System.out.println("Driving with speed = "+speed);
    }
    public int currentSpeed(){
        return speed;
    }
    public void speedUp(int newSpeed){
        this.speed = newSpeed;
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "black", true, 100);
        System.out.printf("brand of my car is : %s\n",myCar.brand);
        System.out.printf("Color of my car is : %s\n",myCar.color);
        System.out.printf("IsABSPresent in my car : %b\n",myCar.isABSPresent);
        myCar.start();
        System.out.println("My Car is started with speed = "+myCar.speed);
        System.out.println("current speed of my car = "+myCar.speed);
        myCar.speedUp(200);
        System.out.println("current speed of my car = "+myCar.speed);

    }
}
