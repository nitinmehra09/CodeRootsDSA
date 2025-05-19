public class Myfunc {
    public void calculateArea(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);

    }
    public static void main(String[] args) {
        Myfunc obj = new Myfunc();
        obj.calculateArea(5, 10);
    }
}
