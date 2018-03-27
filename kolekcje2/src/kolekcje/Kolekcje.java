
package kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Kolekcje {

    
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map = new HashMap();
        map.put(1,1250);
        map.put(2,1260);
        map.put(3,1270);
        map.put(4,1280);
        System.out.println(map);
        
        HashMap<Integer,Integer> map2 = new HashMap();
        
        
            for(Integer a : map.keySet())
            {
                map2.put(map.get(a), a);
            }
            System.out.println(map2);
            
        Collection<Integer> wart = map.values();    
        Set<Integer> key = map.keySet();
        ArrayList<Integer> list = new ArrayList();
        list.addAll(key);
        
        ArrayList<Integer> list2 = new ArrayList();
        list2.addAll(wart);
      
        System.out.println(list);
        System.out.println(list2);
    }
    
}
