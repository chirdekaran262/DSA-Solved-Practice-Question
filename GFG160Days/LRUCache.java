import java.util.*;

class LRUCache {
    
    static int cap;
    
    static LinkedList<Integer> lruLL;
    
    static Map<Integer,Integer> map;

    LRUCache(int cap) {
        // code here
        this.cap=cap;
        this.lruLL=new LinkedList<>();
        this.map=new HashMap<>();
    }

    public static int get(int key) {
        
        if(!map.containsKey(key)){
            return -1;
        }
        
        lruLL.remove(Integer.valueOf(key));
        lruLL.addFirst(key);
        return map.get(key);
        
        // your code here
    }

        
    public static void put(int key, int value) {
        // your code here
        
        if(map.containsKey(key)){
            map.put(key,value);
            lruLL.remove(Integer.valueOf(key));

        }
        else{
            if(map.size()>=cap){
                int LastKey=lruLL.removeLast();
                map.remove(LastKey);
            }
            map.put(key,value);
        }
        lruLL.addFirst(key);
    }
    public static void main(String[] args) {
        new LRUCache(3); // initialize the cache
    LRUCache.put(1, 1);
    LRUCache.put(2, 2);
    LRUCache.put(3, 3);
    System.out.println(LRUCache.get(1)); // returns 1
    LRUCache.put(4, 4); // evicts key 2
    System.out.println(LRUCache.get(2)); // returns -1 (not found)  
    }
}