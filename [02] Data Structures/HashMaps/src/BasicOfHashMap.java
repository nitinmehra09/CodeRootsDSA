
import java.util.HashMap;

public class BasicOfHashMap{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Hello",5);
        map.put("nitin",5);
        map.put("hie",3);
        map.put("riya",4);
        map.replace("nitin",5,19);
        map.put("jenny",11);
        
        if(map.containsKey("jenny")){
            System.out.println("jenny is in map");
        }
// method 1
        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("key ->" +entry.getKey());
            System.out.println("Value ->"+entry.getValue());
        }
        map.putIfAbsent("jenny", 10);
        
// method 2
        for(String key : map.keySet()){
            System.out.println("Key -> "+key);
            System.out.println("Value -> "+map.get(key));
        }

        System.out.println(map.getOrDefault("mihir",-1));

    }
}