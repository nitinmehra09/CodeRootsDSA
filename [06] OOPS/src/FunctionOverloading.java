class FunctionOver{
    int age;
    String name;
    public FunctionOver() {
        this.age = 20;
        this.name = "Xyaa";
    }
    public FunctionOver(int age){
        this.age = age;
        this.name = "Xyaa";
    }
    FunctionOver(String name){
        this.age = 20;
        this.name = name;
    }
    FunctionOver(int age , String name){
        this.name = name;
        this.age = age;
    } 
}
public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println("Defualt name = Xyaa and age = 20");
        FunctionOver a = new FunctionOver();
        System.out.printf("name = %s and age = %d\n",a.name,a.age);
        
        FunctionOver b = new FunctionOver("nitin");
        System.out.printf("name = %s and age = %d\n",b.name,b.age);
        
        FunctionOver c = new FunctionOver(13);
        System.out.printf("name = %s and age = %d\n",c.name,c.age);
        
        FunctionOver d = new FunctionOver(11, "Anime");
        System.out.printf("name = %s and age = %d\n",d.name,d.age);
    }
}
