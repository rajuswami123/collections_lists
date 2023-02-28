package org.example;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lists {
    public static void main(String[] args) {
        Logger ou = Logger.getLogger("com.api.jar");
        Ll ob=new Ll();
        ob.	insert(1);
        ob.	insert(2);
        ob.insert(3);
        ob.insert(12,1);
        ob.remove(3);
        ob.print();
        ou.info("this are some implementation of linked list.............................");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(255);
        numbers.add(3,143);
        numbers.remove(0);
        ou.log(Level.INFO,()->"the size is"+numbers.size());
        ou.log(Level.INFO,()->""+numbers);
        ou.info("this are some implementations of arraylist......................");
        String[] list =new String[10];
        list[0]="hello";
        list[1]="sir";
        ou.log(Level.INFO,()->"Length is "+list.length+"\n"+list[0]+" "+list[1]);

    }
}