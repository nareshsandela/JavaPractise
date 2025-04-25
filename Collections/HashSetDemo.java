package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String [] args){

        HashSet<String> hashSet = new HashSet<>();

        // Adding new elements to the HashSet using add() method
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Ruby");

//        Traverse
        for (String language: hashSet){
            System.out.println(language);
        }
        //out put is
        // Java
        //Ruby
        // Python

        // HashSet doesn't allow duplicates
        hashSet.add("Java");
        hashSet.add("Python");
        System.out.println(hashSet); //  [Java, Ruby, Python]

        // It allows only one null value even if we add multiple null values
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet); //[null, Java, Ruby, Python]

        //Create HashSet from Another Collection by using addAll()
        //It can be done by two ways 1)passing hashSet in HashSet<String> hashSet1 = new HashSet<>(hashSet);
        //2)hashSet1.addAll(hashSet); by addAll method
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Java1");
        hashSet1.add("Python1");
        hashSet1.add("Ruby1");
        System.out.println(hashSet1); //[Python1, Ruby1, Java1]
        hashSet1.addAll(hashSet);
        System.out.println(hashSet1); //[null, Java, Python1, Ruby1, Ruby, Java1, Python]

        // HashSet class does not have a get() method to access its elements as it is not an indexed collection. However, you can iterate through a HashSet to access its elements.
//        Iterator<String > iterator = hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        //out put is
        //null
        // Java
        //Ruby
        // Python

        // remove() method removes a single specified element from the set.
        hashSet.remove("Java");
        System.out.println(hashSet); //[null, Ruby, Python]

        // removeAll() removes all elements from the set that are contained in the specified collection.
  //      hashSet.removeAll(hashSet);
        System.out.println(hashSet); //[]
  //      hashSet.removeAll(Arrays.asList("Ruby"));
        System.out.println(hashSet); //[null, Python]

//        removeIf(Predicate<? super E> filter): This method removes all elements from the set that satisfy the given predicate.
        hashSet.removeIf(n -> (n.charAt(0)=='P'));
        System.out.println(hashSet);

//        Enhanced for loop
        for (String language : hashSet){
            System.out.println(language);
        }
//        out put is
//        null
//        Ruby
//         Python

        //Basic loop with iterartor
     for(Iterator<String> iterator = hashSet.iterator();iterator.hasNext();)
        {
            System.out.println(iterator.next());
        }

        //While loop with iterartor
        Iterator<String > iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //JDK 8 forEach() method with lamda
        hashSet.forEach(language -> System.out.println(language));

        //Java 8 streaming + forEach() + lambda expression
        //Here we are converting set into streams and then applying filter where course shouldn't be java and then printing using forEach method
        hashSet.stream().filter(language-> !"Java".equals(language)).forEach(language->System.out.println(language));

        hashSet1.stream().filter(language-> "Java2".equals(language)).forEach(language -> System.out.println(language));

//out put is
        //null
        //Ruby
        // Python
        }

        }

