import java.util.HashMap;
import java.util.Objects;
public class CustomKeyValue {
    public static void main(String[] args) {
        HashMap<Animal,Integer> map = new HashMap<>();
        map.put(new Animal("cat"),3);
        map.put(new Animal("dog"),1);
        map.put(new Animal("cow"),10);
        for(Animal key : map.keySet()){
            System.out.println("key -> "+key);
            System.out.println("Value ->"+map.get(new Animal(key.toString())));
        }
    }
}

class Animal{
    final String name;
    // int hashcode;
    public Animal(String name) {
        // this.hashcode = name.hashCode();
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;

    }
    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;  // both object refer to same 
        if (!(obj instanceof Animal)) return false;  // obj is Animal type or not
        Animal an = (Animal) obj;
        return Objects.equals(this.name, an.name);
    }
}

