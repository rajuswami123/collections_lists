package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

class Ll {
    Logger ou = Logger.getLogger("com.api.jar");
    Node head;

    void insert(int value) {
        Node iNode = new Node();
        iNode.data = value;
        if (this.head == null) {
            head = iNode;
        } else {
            Node cNode = head;
            while (cNode.next != null) {
                cNode = cNode.next;
            }
            cNode.next = iNode;

        }
    }

    void insert(int value, int ind) {
        Node iNode = new Node();
        iNode.data = value;
        Node n = head;
        for (int i = 0; i < ind - 1; i++) {
            n = n.next;
        }
        iNode.next = n.next;
        n.next = iNode;


    }

    void remove(int ind) {
        Node n = head;
        Node n1 = null;
        if (ind == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < ind - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    void print() {


        while (head != null) {
            ou.log(Level.INFO, () -> "" + head.data);
            head = head.next;


        }
    }
}
