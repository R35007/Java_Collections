package Collections;

import java.util.Stack;

public class Stack_List
{

    public static void main(String[] args)
    {

        Stack<String> s = new Stack<String>();
        s.push("F");
        s.push("D");
        s.push("A");
        s.push("I");
        s.push("B");
        s.push("S");
        s.push(null);
        s.push("A");

        System.out.println("s = " + s);         // [ F , D , A , I , B , S , null , A]
        System.out.println("s.pop = " + s.pop());       //  F
        System.out.println("s = " + s);         // [F , D , A , I , B , S , null ]
        System.out.println("s.peek = " + s.peek());         //  null
        System.out.println("s = " + s);         // [F , D , A , I , B , S , null ]
        System.out.println("s.search('B') = " + s.search("B"));      //  3

        s.push("V");
        System.out.println("s = " + s);         // [ D , A , I , B , S , null , V]
        System.out.println("s.search('B') = " + s.search("B"));      //  4
        System.out.println("s.search('Z') = " + s.search("Z"));     //  -1
        System.out.println("s.empty = " + s.empty());           //  False

    }

}

/*
Constructors:
1.  Stack s=new Stack();

Methods
1.  push(Object o);
2.  pop();      // remove the top most element;
3.  peek();     // return the topnof the element without removing
4.  search(Object o);       // returns the offset of the element
5.  empty();

 Search operation retrives the offset of the element.   
 */

 /*
Heterogeous = not allowed
Serializable = True
Clonable = True
RandomAccess = False
Duplicates = True
null = allowed
Insertion Order = Preserved
version = 1.0v (Legacy)
 */
