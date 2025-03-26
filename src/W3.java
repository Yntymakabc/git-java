import java.util.*;

public class W3 {
    public static void main(String[] args) {

    // 8. Write a Java program to sort a given array list.
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,7,6,5,4,33));
            Collections.sort(arr);
            // System.out.println(arr);


        
    // 17. Write a Java program to empty an array list.
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,7,6,5,4,33));

        arr2.removeAll(arr2);
        // System.out.println(arr2);
        
        for(int i=arr2.size()-1; i>=0; i--){
            arr2.remove(i);
        }

        // System.out.println(arr2);


    // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1,2,3,4));
        arr3.set(2, 101010);
        // System.out.println(arr3);


    // 18. Write a Java program to test whether an array list is empty or not.
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> arr5 = new ArrayList<>();
        // System.out.println(arr4.isEmpty());
        // System.out.println(arr5.isEmpty());


    
    //11. Write a Java program to reverse elements in an array list.
        List<Integer> arr6 = new ArrayList<>(Arrays.asList(1,2,3,4));
        // System.out.println(arr6);
        Collections.reverse(arr6);
        

    //15. Write a Java program to join two array lists. 
        List<Integer> arr7 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> arr8 = new ArrayList<>(Arrays.asList(5,6,7));
        List<Integer> newArray = new ArrayList<>();
        newArray.addAll(arr7);
        newArray.addAll(arr8);
        // System.out.println(newArray);

/////////////////////////////////////LINKED LIST//////////////////////////////////////////////////////////
    // 26. Write a Java program to replace an element in a linked list.

        List<String> arr9 = new LinkedList<>();
        arr9.add("null");
        arr9.add("Yntymak");
        arr9.add(("aibek"));
        // System.out.println(arr9);
        int ourIndex = 2;
        String ourWord = "Hello";
        arr9.set(ourIndex, ourWord);
        // 
        

    // 25. Write a Java program to compare two linked lists.
        List<String> words = new LinkedList<>(Arrays.asList("HEllo", "world", "isgood"));
        List<String> second = new LinkedList<>(Arrays.asList("oleh", "world", "asdf"));
        List<Boolean> result = new LinkedList<>();

        for(String w:words){
            if(second.contains(w)){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        // System.out.println(result);


    //23. Write a Java program to convert a linked list to an array list.
        List<String> words1 = new LinkedList<>(Arrays.asList("HEllo", "world", "isgood"));
        List<String> words2 = new ArrayList<>(words1);
        // System.out.println(words2);


    //22. Write a Java program to check if a particular element exists in a linked list.
        List<String> words3 = new LinkedList<>(Arrays.asList("HEllo", "world", "isgood"));
        String target = null;
        if(words3.contains(target)){
            System.out.println("countains");
        }
        else{
            System.out.println("No such world");
        }
        

    //21. Write a Java program to retrieve, but not remove, the last element of a linked list.
        List<String> words4 = new LinkedList<>(Arrays.asList("HEllo", "world", "isgood"));
        // System.out.println(words4.getLast());


    //18. Write a Java program to copy a linked list to another linked list.
        List<String> words5 = new LinkedList<>(Arrays.asList("HEllo", "world", "isgood"));
        List<String> newWords = new LinkedList<>(words5);
        



/////////////////////////////////////HASH SET//////////////////////////////////////////////////////////    


    //12. Write a Java program to remove all elements from a hash set.
        Set<Integer> sett = new HashSet<>(Arrays.asList(1,2,3,4,5,5,5));
        sett.removeAll(sett);
    // System.out.println(sett);


    //11. Write a Java program to compare two sets and retain elements that are the same.
        Set<Integer> sett2 = new HashSet<>(Arrays.asList(1,2,3,4,5,5,5));
        Set<Integer> sett3 = new HashSet<>(Arrays.asList(1,2,3,11,22));
        List<Integer> setss = new ArrayList<>();
        for(int i:sett2){
            if(sett3.contains(i)){
                setss.add(i);
            }
        }
    //System.out.println(setss);


    //9. Write a Java program to find numbers less than 7 in a tree set.
        Set<Integer> lessthanseven = new TreeSet<>(Arrays.asList(1,2,3,4,57));
        List<Integer> numbers = new ArrayList<>();
        for(int i: lessthanseven){
            if(i<7){
                numbers.add(i);
            }
        }
    //System.out.println(numbers);


    //1. Write a Java program to append the specified element to the end of a hash set.
        Set<Integer> end = new TreeSet<>();
        end.add(4);
        end.add(5);
        // System.out.println(end);


    //8. Write a Java program to convert a hash set to a tree set.
        Set<Integer> set4 = new HashSet<>();
        set4.add(3);
        set4.add(5);
        Set<Integer> set5 = new TreeSet<>(set4);

    //10. Write a Java program to compare two hash set.
        Set<Integer> comparess = new TreeSet<>(Arrays.asList(1,2,3,4,57));
        Set<Integer> c = new TreeSet<>(Arrays.asList(1,2,5,657,57));
        
        for(int i:comparess){
            if(c.contains(i)){
                //System.out.println("YES");
            }
            else{
                //System.out.println("NO");
            }
        }

/////////////////////////////////////TREE SET////////////////////////////////////////////////////////// 
 
    //3. Write a Java program to add all the elements of a specified tree set to another tree set.

    Set<Integer> sets2 = new TreeSet<>(Arrays.asList(1,2,44,5,6));
    Set<Integer> sets3 = new TreeSet<>(Arrays.asList(8,7,9,99));
    sett2.addAll(sets3);
    System.out.println(sett2);
    

    //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        Set<Integer> sets4 = new TreeSet<>(Arrays.asList(1,2,44,5,6));
        int givenhkkh = 7;
        
        for(int i:sets4){
            if(i > givenhkkh){
                System.out.println(i);
            }
        }

    //14. Write a Java program to retrieve and remove the first element of a tree set.
        TreeSet<Integer> sets5 = new TreeSet<>();
        sets5.add(4);
        sets5.add(7);
        sets5.pollFirst();
    //15. Write a Java program to retrieve and remove the last element of a tree set.
        TreeSet<Integer> sets6 = new TreeSet<>();
        sets5.add(4);
        sets5.add(7);
        sets5.add(88);
        sets5.pollLast();

    //Write a Java program to remove a given element from a tree set.
        TreeSet<Integer> sets7 = new TreeSet<>(Arrays.asList(1,2,44,5,6));
        int b = 1;
        sets7.remove(b);
        System.out.println(sets7);
    

    //13. Write a Java program to get an element in a tree set that has a lower value than the given element.
        TreeSet<Integer> setT =  new TreeSet<>();
        int numm = 6;
        setT.add(45);
        setT.add(11);
        setT.add(1);
        setT.add(2);
        System.out.println("Lower is:" + setT.lower(numm));

/////////////////////////////////////PRIORITY QUEUE////////////////////////////////////////////////////////// 

    // 12. Write a Java program to change priorityQueue to maximum priority queue.
        PriorityQueue<Integer> aa = new PriorityQueue<>(10, Collections.reverseOrder());
        aa.add(3);
        aa.add(4);
        aa.add(5);
        Collections.reverseOrder();
        //System.out.println(aa);


    //11. Write a Java program to convert a Priority Queue element to string representations.   
        PriorityQueue<String> bb = new PriorityQueue<>();
            bb.add("target");
            bb.add("hello");
            bb.add("eee");
        String ss = bb.toString();
        //System.out.println(ss);
    
    //10. Write a Java program to convert a priority queue to an array containing all its elements.
        PriorityQueue<String> cc = new PriorityQueue<>();
            cc.add("Red");
            cc.add("Green");
            cc.add("Black");
        ArrayList<String> arree = new ArrayList<>(cc);
        //System.out.println(arree);

    // 9.Write a Java program to retrieve and remove the first element.
        PriorityQueue<String> dd = new PriorityQueue<>(Arrays.asList("AIBEK", "hela", "MAWQ"));
        dd.poll();

    //8. Write a Java program to retrieve the first element of the priority queue.
        PriorityQueue<String> ee = new PriorityQueue<>(Arrays.asList("AIBEK", "hela", "MAWQ"));
        dd.peek();

    //6. Write a Java program to count the number of elements in a priority queue.
        PriorityQueue<String> gg = new PriorityQueue<>(Arrays.asList("AIBEK", "hela", "MAWQ"));
        System.out.println(gg.size());



/////////////////////////////////////HASH MAP////////////////////////////////////////////////////////// 
//12. Write a Java program to get a collection view of the values contained in this map.
        HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
            hashMap.put(1,"a");
            hashMap.put(2,"b");
            hashMap.put(3,"c");
            hashMap.put(4,"d");
            hashMap.put(5,"e");
        System.out.println(hashMap.values());


//11. Write a Java program to get a set view of the keys contained in this map.
        HashMap<Integer,String> hashMap1= new HashMap<Integer,String>();
            hashMap.put(1,"a");
            hashMap.put(2,"b");
            hashMap.put(3,"c");
            hashMap.put(4,"d");
            hashMap.put(5,"e");

        Set keys = hashMap1.keySet();
    
        //Write a Java program to get the value of a specified key in a map.
        HashMap<Integer,String> hashMap2= new HashMap<Integer,String>();
            hashMap2.put(1,"a");
            hashMap2.put(2,"b");
            hashMap2.put(3,"c");
            hashMap2.put(4,"d");
            hashMap2.put(5,"e");

            System.out.println(hashMap2.get(2));

        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
            HashMap<Integer,String> hashMap3= new HashMap<Integer,String>();
            System.out.println(hashMap3.isEmpty());

        //Write a Java program to test if a map contains a mapping for the specified key
            HashMap<Integer,String> hashMap4= new HashMap<Integer,String>();
                hashMap4.put(1, "yntymak");
                hashMap4.put(2, "akulenok");
                hashMap4.put(3, "aibek");

            int ifContains = 1;
            if(hashMap4.containsKey(ifContains)){
                System.out.println("YES is contains key " + ifContains);
            }
            else{
                System.out.println("THere is no such key");
            }
        //Write a Java program to test if a map contains a mapping for the specified value.
            HashMap<Integer,String> hashMap5= new HashMap<Integer,String>();
                hashMap4.put(1, "yntymak");
                hashMap4.put(2, "akulenok");
                hashMap4.put(3, "aibek");
            String ifContains2 = "yntymak";
        
            if(hashMap5.containsValue(ifContains2)){
                System.out.println("Yes there is a value: " + ifContains2);
            }
            else{
                System.out.println("no there is no such value");
            }
        


/////////////////////////////////////TREE MAP//////////////////////////////////////////////////////////  
/// 
/// 
/// Write a Java program to get a portion of a map whose keys are greater than a given key.
        TreeMap < Integer, String > treeMap = new TreeMap < Integer, String > ();  

        treeMap.put(1,"Hello");
        treeMap.put(2, "world") ;

        int targetKey = 2;

        System.out.println(treeMap.tailMap(targetKey, true));//определетяет включать ли

//Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
        TreeMap < Integer, String > treeMap2 = new TreeMap < Integer, String > (); 
            treeMap2.put(1,"Hello");
            treeMap2.put(2, "world") ;
            treeMap2.put(3, "aibek");
            treeMap2.put(7, "ifContains2");

           System.out.println(treeMap2.lowerKey(7));


//Write a Java program to get all keys from a Tree Map.
TreeMap < Integer, String > treeMap3 = new TreeMap < Integer, String > (); 
        treeMap3.put(1,"Hello");
        treeMap3.put(2, "world") ;
        treeMap3.put(3, "aibek");
        treeMap3.put(7, "ifContains2");
            System.out.println(treeMap3.keySet());
    
//ite a Java program to get the greatest key less than or equal to the given key.
        TreeMap < Integer, String > treeMap4 = new TreeMap < Integer, String > (); 
            treeMap4.put(1,"Hello");
            treeMap4.put(2, "world") ;
            treeMap4.put(3, "aibek");
            treeMap4.put(7, "ifContains2");
            treeMap4.put(9, "moa");
            System.out.println("a" +treeMap4.floorKey(3));

//Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        TreeMap < Integer, String > treeMap5 = new TreeMap < Integer, String > (); 
        treeMap5.put(1,"Hello");
        treeMap5.put(2, "world") ;
        treeMap5.put(3, "aibek");
        treeMap5.put(7, "ifContains2");
        treeMap5.put(9, "moa");
        System.out.println(treeMap4.ceilingKey(7));


//Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.

        TreeMap < Integer, String > treeMap6 = new TreeMap < Integer, String > (); 
            treeMap6.put(1,"Hello");
            treeMap6.put(2, "world") ;
            treeMap6.put(3, "aibek");
            treeMap6.put(7, "ifContains2");
            treeMap6.put(9, "moa");
            System.out.println(treeMap4.lowerEntry(3));


    }
}

