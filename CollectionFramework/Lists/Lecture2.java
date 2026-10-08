package CollectionFramework.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Lecture2 {
    public static void main(String[] args) {

        Collection<String> cs = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

        Iterator<String> itc = cs.iterator();
        while(itc.hasNext()){
            String str = itc.next();
            if (str.contains("A")){
                itc.remove();
            }
        }
        System.out.println(cs + " ");

        cs.removeIf(result -> result.contains("B"));
        System.out.println(cs + " ");

        Collection<String> cs2 = new ArrayList<>(Arrays.asList("SF","YU"));
        cs.addAll(cs2);
        System.out.println("After change + " + cs);

        System.out.println(cs.containsAll(cs2));

        String[] os = cs.toArray(new String[0]); // Convert the Collection into an Array. Create a String array with size 0 (an empty array).
        for (String o : os) {
            System.out.print(o + " ");
        }
    }
}

/*

COLLECTION INTERFACE
│
├── Adding
│   ├── add()              ✅
│   └── addAll()           ✅
│
├── Removing
│   ├── remove()           ✅
│   ├── removeAll()        ✅
│   ├── removeIf()         ⏳
│   └── clear()            ✅
│
├── Checking
│   ├── contains()         ⏳
│   ├── containsAll()      ⏳
│   └── isEmpty()          ⏳
│
├── Information
│   └── size()             ✅
│
├── Traversal
│   ├── iterator()         ✅
│   ├── hasNext()          ✅
│   ├── next()             ✅
│   ├── iterator.remove()  ⏳
│   └── forEach()          ⏳
│
└── Conversion
    └── toArray()          ⏳


 */