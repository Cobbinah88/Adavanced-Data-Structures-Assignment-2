/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Hp
 */
public class Node {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> list = new LinkedList<String>();
        // adding elements in the list
        list.add("Emmanuel");
        list.add("Cobbinah");
        list.add("Francis");
        list.add("60");
        list.add("20"); 
        

        // a collection is created
        Collection<String> collect = new ArrayList<String>();
        collect.add("Kwaku");
        collect.add("Jamal");
        collect.add("Fred");
        collect.add("Edna");
        collect.add("Papa");
        
        // the list is displayed

        System.out.println("The LinkedList is: " + list);
        
        // the list is cleared
        list.clear();
        System.out.println("The list after clearing all elements is :" + list);

        //adding collection to the list

       list.addAll(collect);

        System.out.println("The new linked list is: " + list); 

        // adding new elements at the first
        list.addFirst("Giovanni");
        list.addFirst("watford");

        System.out.println("The added list is:" + list);

        //adding elements at the end of the list 
        list.addLast("The");
        list.addLast("Last");
        System.out.println("The new list with elements at the last is: " + list);

        // the first element of the list  is displayed
        System.out.println("The first element is:" + list.getFirst());

        // last element from the list is displayed
        System.out.println("The last element is:" + list.getLast());
        
        // first position of an element is returned
        System.out.println("The first occurence of Steve is at the index:" + list.indexOf("Emmanuel"));
        System.out.println("The first occurence of 20 is at the index:" + list.indexOf("20"));

        // the removeFirst() method
        System.out.println("The first element is: " + list.removeFirst());

        //  the removeLast() method
        System.out.println("The last  element is removed: " + list.removeLast());

         //the size of the list is displayed
        System.out.println("The size of the linked list is:" + list.size()); 
    }
    
    
       
    }
    
    }
    
}
