package org.example;

import java.util.ArrayList;
import java.util.logging.Logger;

class node{
    int data;
    node next;
}
class ll{
    Logger ou = Logger.getLogger("com.api.jar");
    node head;
    void insert(int value){
        node inode=new node();
        inode.data=value;
        if(this.head==null){
            head=inode;
        }
        else{
            node cnode=head;
            while(cnode.next !=null){
                cnode=cnode.next;
            }
            cnode.next=inode;

        }
    }
    void insert(int value,int ind) {
        node inode = new node();
        inode.data = value;
        node n = head;
        for(int i=0;i<ind-1;i++){
            n=n.next;
        }
        inode.next=n.next;
        n.next=inode;



    }
    void remove(int ind){
        node n =head;
        node n1=null;
        if(ind==0){
            head=head.next;
        }
        else{
            for(int i=0;i<ind-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
        }
    }
    void print(){


        while(head !=null){
            ou.info(""+head.data);
            head=head.next;


        }
    }
}


public class Lists {
    public static void main(String[] args) {
        Logger ou = Logger.getLogger("com.api.jar");
        ll ob=new ll();
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
        ou.info("the size is"+numbers.size());
        ou.info(""+numbers);
        ou.info("this are some implementations of arraylist......................");
        String List[]=new String[10];
        List[0]="hello";
        List[1]="sir";

        List[0]="hi";
        ou.info("Length is "+List.length+"\n"+List[0]+" "+List[1]);

    }
}