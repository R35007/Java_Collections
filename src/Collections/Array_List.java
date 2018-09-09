package Collections;

import java.io.Serializable;
import java.util.List;
import java.util.RandomAccess;

public class Array_List
{

    public static void main(String[] args)
    {
        
        List al = new java.util.ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(null);
        al.add(null);

        //Display Result
        System.out.println("al = " + al);                                              //   [A , B , C , D , 1 , 2 , 3 , 4 , null , nul]
        System.out.println("al.size = " + al.size());                       //10
        System.out.println("al.contains('D') = " + al.contains("D"));     //  True
        System.out.println("al.indexof('D') = " + al.indexOf("D"));       //  3
        System.out.println("al.empty = " + al.isEmpty());                //  False
        System.out.println("al.get(5) = " + al.get(5));                                 //   2
        System.out.println("al.remove(1) = " + al.remove(1));                          //  B
        System.out.println("al = " + al);                                              //   [A , C , D , 1 , 2 , 3 , 4 , null , nul]
        System.out.println("al.size = " + al.size());                       //9
        System.out.println("al.contains('B') = " + al.contains("B"));     //  False

        al.set(0, "a");                   // Set "A" to "a"
        System.out.println("al = " + al);                //   [a  , C , D , 1 , 2 , 3 , 4 , null , nul]

        al.add(4, "F");              // Set "A" to "a"
        System.out.println("al = " + al);                //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul]

        System.out.println("al.size = " + al.size());      //10

        al.add(5);
        System.out.println("al = " + al);        //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5]
        System.out.println("al.size = " + al.size());      //11

        System.out.print("Serializable = ");
        System.out.println(al instanceof Serializable);     //  True
        System.out.print("Cloneable = ");
        System.out.println(al instanceof Cloneable);     //  True
        System.out.print("RandomAccess = ");
        System.out.println(al instanceof RandomAccess);     //  True

        al.clear();
        System.out.println("al.size = " + al.size());           // 0
        System.out.println("al = " + al);           // []

    }
}

/*
Constructors :
1.  List al = new java.util.ArrayList();
2.  List al = new java.util.ArrayList(int initialCapacity);
3.  List al = new java.util.ArrayList(Collection c);
4.  List l=Collections.synchronizedList(al);  // to convert ArrayList into Synchronizable

Default Capacity = 10
New Capacity = (Current Capacity* 3/2) + 1      //Creates New Capacity after reaching 100% of the Current Capacity

ArrayList and Vector implements "RandomAccess" Interfaces
RandomAccess dosen't contain any method and so it is called as "Marker Interface"

Best Choice = Retriving
Worst Choice = Middle insertion or removing
 */

 /*
Heterogeous = allowed
Serializable = True
Clonable = True
RandomAccess = True
Duplicates = True
null = allowed
Insertion Order = Preserved
Synchronized = False
Multiple Threads = allowed
Thread Saftey = False
Performance = High 
version = 1.2v
 */
