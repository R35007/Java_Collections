package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_cursor
{
    public static void main(String[] args)
    {
        
        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        for (int i = 10; i <= 20; i++)
        {
            ll.add(i);
        }
        
        System.out.println("ll = " + ll);       //   [ 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20]
        ListIterator ltr = ll.listIterator();
        while (ltr.hasNext())
        {
            Integer i = (Integer) ltr.next();
            if (i.equals(15))            
            {
                ltr.remove();
            }            
            else if (i.equals(13))
            {
                ltr.add(25);
                ltr.add(44);
            }
            else if (i.equals(20))
            {
                ltr.set(30);
            }
        }    
        System.out.println("ll = " + ll);       //   [ 10 , 11 , 12 , 13 , 25  , 14 , 16 , 17 , 18 , 19 , 30]
    }   
}

/*
Constructor:
1.  ListIteration ltr=v.listIterator();  // v = any List object

Methods:
1.  hasNext();
2.  next();
3.  nextIndex();

4.  hasPrevious();
5.  previous();
6.  previousIndex();

7.  remove();
8.  set(Object o);
9.  add(Object o);

It is a Child interface od Iterator

Limitations:
1.  Only List Collection can be used. It is not a universal cursor

Advantages:
1.  Its is a Bidirectional cursor.
2.  Move both forwarad and backward direction
3.Read, Remove, Replace, Add operations can be done
*/