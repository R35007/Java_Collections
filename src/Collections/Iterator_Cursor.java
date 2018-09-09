package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Iterator_Cursor
 {

    public static void main(String[] args)
    {
      
        List<Integer> al = new ArrayList<Integer>();
        
        for (int i = 10; i <= 20; i++)
        {
            al.add(i);
        }
        
        System.out.println("al = " + al);     //  [ 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20]
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            Integer i = (Integer) itr.next();
            if (i%2==0)            
            {
                System.out.println("i = " + i);
            }            
            else            
            {
                itr.remove();
            }
        }                
        System.out.println("al = " + al);
    }

}

/*
Constructor:
1.  Iteration itr=v.iterator();  // v = any Collection object

Methods:
1.  hasNext();
2.  next();
3.  remove();

Limitations:
1.  Only Forward direction is applied. It is a universal cursor
2.  Both read and remove action can be performed

*/