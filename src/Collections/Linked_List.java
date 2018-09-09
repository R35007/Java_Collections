package Collections;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Linked_List
{
    
    public static void main(String[] args)
    {
        
        LinkedList<Object> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(null);
        ll.add(null);
        
        //Display Result
        System.out.println("ll = " + ll);                                              //   [A , B , C , D , 1 , 2 , 3 , 4 , null , nul]
        System.out.println("ll.size = " + ll.size());                       //10
        System.out.println("ll.contains('D') = " + ll.contains("D"));     //  True
        System.out.println("ll.indexof(null) = " + ll.indexOf(null));       //  8
        System.out.println("ll.lastIndexof(null) = " + ll.lastIndexOf(null));       //  9
        System.out.println("ll.empty = " + ll.isEmpty());                //  Fllse
        System.out.println("ll.get(5) = " + ll.get(5));                                 //   2
        System.out.println("ll.remove(1) = " + ll.remove(1));                          //  B
        System.out.println("ll = " + ll);                                              //   [A , C , D , 1 , 2 , 3 , 4 , null , nul]
        System.out.println("ll.size = " + ll.size());                       //9
        System.out.println("ll.contains('B') = " + ll.contains("B"));     //  Fllse

        ll.set(0, "a");                   // Set "A" to "a"
        System.out.println("ll = " + ll);                //   [a  , C , D , 1 , 2 , 3 , 4 , null , nul]

        ll.add(4, "F");              // Set "A" to "a"
        System.out.println("ll = " + ll);                //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul]

        System.out.println("ll.size = " + ll.size());      //10

        ll.add(5);
        System.out.println("ll = " + ll);        //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5]
        System.out.println("ll.size = " + ll.size());      //11
       
        // Special Method for LinkedList
        ll.addFirst("A");
        System.out.println("ll = " + ll);        //   [A , a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5]
        ll.addLast("Z");
        System.out.println("ll = " + ll);        //   [A , a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5 , Z]
        System.out.println("ll.size = " + ll.size());      //13

        System.out.println("ll.getFirst = " + ll.getFirst());        //   A
        System.out.println("ll.getLast = " + ll.getLast());         //  Z
        System.out.println("ll = " + ll);        //   [A , a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5 , Z]
        
        System.out.println("ll.removeFirst = " + ll.removeFirst());        //   A
        System.out.println("ll = " + ll);        //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5 ]
        System.out.println("ll.removeLast = " + ll.removeLast());         //  Z
        System.out.println("ll = " + ll);        //   [a , C , D , 1 , F ,  2 , 3 , 4 , null , nul , 5 ]
        System.out.println("ll.size = " + ll.size());      //11
        
        System.out.print("Serillizable = ");
        System.out.println(ll instanceof Serializable);     //  True
        System.out.print("Cloneable = ");
        System.out.println(ll instanceof Cloneable);     //  True
        System.out.print("RandomAccess = ");
        System.out.println(ll instanceof RandomAccess);     //  False

        ll.clear();
        System.out.println("ll.size = " + ll.size());           // 0
        System.out.println("ll = " + ll);           // []

    }
}

/*
Constructors :
1.  LinkedList ll = new LinkedList();
2.  LinkedList ll = new LinkedList(Collection c);

Methods:
1.  addFirst(Object o);
2.  addLastObject o);
3.  get First();
4.  getLast();
5.  removeFirst();
6.  removeLast();

Sequense Operation

Best Choice = Middle insertion or removing
Worst Choice = Retriving
 */

 /*
Heterogeous = allowed
Serializable = True
Clonable = True
RandomAccess = False
Duplicates = True
null = allowed
Insertion Order = Preserved
Performance = High in middle Insertion or removing
version = 1.2v
 */
