package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_Set
{
    public static void main(String[] args)
    {
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
        lhs.add("S");
        lhs.add("I");
        lhs.add("V");
        lhs.add("A");
        lhs.add("R");
        System.out.println("lhs.add('A') = " + lhs.add('A'));         //  True
        lhs.add('M');
        lhs.add(22);
        System.out.println("lhs.add('A') = " + lhs.add('A'));         //  Fa;se
        lhs.add('N');
        lhs.add(null);
        
        System.out.println("lhs = " + lhs);
        System.out.println("lhs.contains('M') = " + lhs.contains('M'));           //  True
        System.out.println("lhs hashCode= " + lhs.hashCode());
        
    }
}
/*
Constructors
1.  LinkedHashSet lhs=new LinkedHashSet();
2.  LinkedHashSet lhs=new LinkedHashSet(int initialCapacity);
3.  LinkedHashSet lhs=new LinkedHashSet(int initialCapacity , float fillRatio);
4.  LinkedHashSet lhs=new LinkedHashSet(Collection c);

Capacity is similar to HashSet

Best Choice : programs based on cache memory
*/
 /*
Heterogeous = allowed
Serializable = True
Clonable = True
RandomAccess = False
Duplicates = False
null = only once allowed
Insertion Order = Preserved
version = 1.2v
 */