class FirstClass{
    String name;
    int age;
    String gen;
    public void setter(String name, int age, String gen){
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

}
public class Myclass {
    public static void main(String[] args) {
        FirstClass myobj = new FirstClass();
        myobj.setter("nitin",19,"boy");
        System.out.println("Name = "+myobj.name);
        System.out.println("age = "+myobj.age);
        System.out.println("gender = "+myobj.gen);
    }
}