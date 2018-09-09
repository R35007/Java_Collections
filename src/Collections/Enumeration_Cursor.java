package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Cursor
 {

    public static void main(String[] args)
    {
      
        Vector<Integer> v = new Vector<Integer>();
        
        for (int i = 10; i <= 20; i++)
        {
            v.addElement(i);
        }
        
        System.out.println("v = " + v);     //  [ 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20]
        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
             Integer i= (Integer) e.nextElement();
            if (i%2==0)            
            {
                System.out.println("i = " + i);
            }    
            
        }          
    }

}

/*
Constructor:
1.  Enumeration e=v.elements();  // v = any legacy object

Methods:
1.  hasmoreElements;
2.  nextElement();

Limitations:
1.  Only applicable for leagacy classes. It is not a universal cursor
2.  Only read action can be performed

*/