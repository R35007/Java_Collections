package Collections;

import java.util.Vector;

public class Vector_List
 {

    public static void main(String[] args)
    {
        Vector<String> v = new Vector<String>();
        v.addElement("Siva");
        v.addElement("Ram");
        v.addElement("Vetri");
        v.addElement("Suganya");
        v.addElement("Queen");
        v.addElement("Crush");
        v.addElement("Lover");
        v.addElement("Cute");
        v.addElement("College");
        
        System.out.println("v = " + v);         //  [Siva , Ram , Vetri , Suganya , Queen , Crush , Lover , Cute , College]
        System.out.println("v.size = " + v.size());     //  9
        System.out.println("v.capacity = " + v.capacity());     //  10
        
        
        v.addElement("Orange");
        System.out.println("v = " + v);         //  [Siva , Ram , Vetri , Suganya , Queen , Crush , Lover , Cute , College , Orange]
        System.out.println("v.size = " + v.size());     //  10
        System.out.println("v.capacity = " + v.capacity());     //  10
        
        System.out.println("v.elementAt('3') = " + v.elementAt(3));      //  Suganya
        v.removeElementAt(8);       //  College
        System.out.println("v.size = " + v.size());     //  9
        System.out.println("v.capacity = " + v.capacity());     //10
        System.out.println("v = " + v);         //  [Siva , Ram , Vetri , Suganya , Queen , Crush , Lover , Cute ,  Orange]
        
        v.addElement("Friend");
        v.addElement("Close Friend");
        v.addElement("Virat Koli");
        System.out.println("v = " + v);         //  [Siva , Ram , Vetri , Suganya , Queen , Crush , Lover , Cute ,  Orange , Friend , Close Friend , Virat Koli]
        System.out.println("v.size = " + v.size());         // 12
        System.out.println("v.capacity = " + v.capacity());         //20
        
        v.removeElement("Close Friend");
        System.out.println("v = " + v);         //  [Siva , Ram , Vetri , Suganya , Queen , Crush , Lover , Cute ,  Orange , Friend  , Virat Koli]
        System.out.println("v.size = " + v.size());         // 11
        System.out.println("v.capacity = " + v.capacity());         //20
        
        System.out.println("v.firstElement = " + v.firstElement());         //  Siva
        System.out.println("v.lastElement = " + v.lastElement());          //  Virat Koli
        
        v.removeAllElements();
        System.out.println("v = " + v);             //  v[]
    }

}

/*
Constructors :
1.  Vector v = new Vector();
2.  Vector v = new Vector(int initialCapacity);
3.  Vector v = new Vector(int initialCapacity , int incrementalCapacity);
4.  Vector v = new Vector(Collection c);

Methods:
1.  addElement(Object o);
2.  removeallElements();
3.  removeElement(Object o);
4.  removeElementAt(int index);
5.  elementAt(int index);
6.  firstElement();
7.  lastElement();
8.  size();
9.  capacity();

Default Capacity = 10
New Capacity = Current Capacity* 2      //Creates New Capacity after reaching 100% of the Current Capacity

ArrayList and Vector implements "RandomAccess" Interfaces
RandomAccess dosen't contain any method and so it is called as "Marker Interface"

Best Choice = Retriving
Worst Choice = Middle insertion or removing
 */

 /*
Heterogeous = not allowed
Serializable = True
Clonable = True
RandomAccess = True
Duplicates = True
null = allowed
Insertion Order = Preserved
Synchronized = True
Multiple Threads = not allowed
Thread Saftey = True
Performance = low
version = 1.0v (Legacy)
 */
