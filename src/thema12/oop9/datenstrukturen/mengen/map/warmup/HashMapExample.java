package thema12.oop9.datenstrukturen.mengen.map.warmup;

import java.util.HashMap;

public class HashMapExample { 
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));
    }
}
