import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K,V> {
    class Node{
        K key;
        V value;
        Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    
    private int elments;
    private int tableSize;
    final private double threshold;
    LinkedList<Node>[] hashTable;

    MyHashMap(){
        elments = 0;
        tableSize = 16;
        threshold = 0.75;
        hashTable = new LinkedList[tableSize];
        initialization();
    }
    private void initialization(){
        for(int i=0;i<tableSize;i++){
            hashTable[i] = new LinkedList<>();
        }
    }
    private int gethashcode(K key){
        int hashcode = Objects.hashCode(key);
        return Math.floorMod(hashcode,tableSize);
    }
    private int searchIndexOfkey(K key,int hashcode){
        LinkedList<Node> list = hashTable[hashcode];
        for(int index=0;index<list.size();index++){
            if(Objects.equals(list.get(index).key,key)){
                return index;
            }
        }
        return -1;
    }
    public void rehashing(){
        LinkedList<Node>[] oldList = hashTable;
        tableSize = 2*tableSize;
        elments = 0;
        hashTable = new LinkedList[tableSize];
        initialization();
        for(LinkedList<Node> list : oldList){
            for(Node node : list){
                put(node.key,node.value);
            }
        }

    }
    public void put(K key,V value){
        int hashcode = gethashcode(key);
        int index = searchIndexOfkey(key,hashcode);
        if(index==-1){
            Node node = new Node(key, value);
            hashTable[hashcode].add(0,node);
            elments++;
        }else{
            hashTable[hashcode].get(index).value = value;
        }
        if(elments/(1.0*tableSize) >= threshold){
            rehashing();
        }
    }
    public V get(K key){
        int hashcode = gethashcode(key);
        int index = searchIndexOfkey(key,hashcode);
        if(index==-1){
            return null;
        }
        return hashTable[hashcode].get(index).value;
    }
}