package Collections;

import java.util.HashSet;

public class HashSet_Set
{
    public static void main(String[] args)
    {
        HashSet<Object> hs = new HashSet<Object>();
        hs.add("S");
        hs.add("I");
        hs.add("V");
        hs.add("A");
        hs.add("R");
        System.out.println("hs.add('A') = " + hs.add('A'));         //  True
        hs.add('M');
        hs.add(22);
        System.out.println("hs.add('A') = " + hs.add('A'));         //  Fa;se
        hs.add('N');
        hs.add(null);

        System.out.println("hs = " + hs);
        System.out.println("hs.contains('M') = " + hs.contains('M'));           //  True
        System.out.println("hs hashCode= " + hs.hashCode());
        
        HashSet<Object> hs2 = new HashSet<Object>();
        hs2.add("A");
        hs2.add("R");
        hs2.add("S");
        hs2.add(null);
        hs2.add("I");
        hs2.add('M');
        hs2.add("V");
        hs2.add('N');
        hs2.add('A');
        hs2.add(22);
        
        System.out.println("hs2 = " + hs2);
        System.out.println("hs2 hashCode= " + hs2.hashCode());
        System.out.println("isEquals = " + hs.equals(hs2));     //  hs.hashCode() == hs2.hashCode()
      
       
    }
}
/*
Constructors
1.  HashSet hs=new HashSet();
2.  HashSet hs=new HashSet(int initialCapacity);
3.  HashSet hs=new HashSet(int initialCapacity , float fillRatio);
4.  HashSet hs=new HashSet(Collection c);

Default Capacity = 16
Fill Ratio or Load Factor = 75% or 0.75 ratio
New Capacity = Current Capacity + 75% of Current Capacity

Object.hashCode() returns the sum of hashCodes of the elements in the set.

Best Choice : Serch operation
*/
 /*
Heterogeous = allowed
Serializable = True
Clonable = True
RandomAccess = False
Duplicates = False
null = only once allowed
Insertion Order = not Preserved     //  Objects are inserted based on the hashcode
version = 1.2v
 */

