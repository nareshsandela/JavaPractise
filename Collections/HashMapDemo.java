package Collections;



import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main (String[] args){
        Map<String , Integer> hashMap = new HashMap<>();

        //put method used to add entries
        hashMap.put("Apple",10);
        hashMap.put("Banana",20);
        hashMap.put("Carrot",30);
        System.out.println(hashMap);  //{Apple=10, Carrot=30, Banana=20}

        //The get() method takes the key as an argument and returns the corresponding value.
        System.out.println(hashMap.get("Banana")); //20

        // The HashMap can store only one null key and multiple null values.
        //If we provide null key and provide multiple values for it, it will override the existing first given value.The last given value will be stored
//        If you attempt to access a key that does not exist in the HashMap using the get method, it will return null.
        hashMap.put("null",40);
        hashMap.put("Beetroot",50);
        hashMap.put("Raddish",null);
        hashMap.put("Pomograte",null);
        hashMap.put("null",60);
        System.out.println(hashMap); //{Beetroot=50, Pomograte=null, Apple=10, Carrot=30, null=60, Raddish=null, Banana=20}

//        The remove() method removes the mapping for a key from this map if it is present.
        hashMap.remove("Apple");
        System.out.println(hashMap); //{Beetroot=50, Pomograte=null, Carrot=30, null=60, Raddish=null, Banana=20}

        //We can get the size of the HashMap using the size() method.
        System.out.println(hashMap.size()); //6

        //isEmpty() used to check if map is empty
        System.out.println(hashMap.isEmpty()); //false

        //contains() check if key is available
        System.out.println(hashMap.containsKey("Banana")); //true
        System.out.println(hashMap.containsValue(20)); //true

        //remove keys from hashmap
        //using key
        hashMap.remove("Carrot");
        System.out.println(hashMap); //{Beetroot=50, Pomograte=null, null=60, Raddish=null, Banana=20}
//using key,value pair
        hashMap.remove("Raddish", null);
        System.out.println(hashMap); //{Beetroot=50, Pomograte=null, null=60, Banana=20}

        //keySet() gets all keys
        //return type is set as keys are not duplicated
        System.out.println(hashMap.keySet());  //[Beetroot, Pomograte, null, Banana]

        //values() gets all values
        //return type is Collection as values might be duplicated
        System.out.println(hashMap.values()); // [50, null, 60, 20]


        //ways to iterate over hashmap
        //simple for each emethod
        for(Map.Entry<String ,Integer> entry : hashMap.entrySet()){
            System.out.println("Key is :" + entry.getKey() + " , Value is :" +entry.getValue());
        }
        //Key is :Beetroot , Value is :50
        //Key is :Pomograte , Value is :null
        //Key is :null , Value is :60
        //Key is :Banana , Value is :20

    //using iterator
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("key is :" + entry.getKey() + "Value is : " + entry.getValue());
        }

        //hashmap using java 8

          hashMap.forEach((Key,Value)-> {
           System.out.println("Key is "+ Key);
          System.out.println("Value is " + Value);
          });
        //Key is Pomograte
        //Value is null
        //Key is null
        //Value is 60
        //Key is Banana
        //Value is 20


    }
}
