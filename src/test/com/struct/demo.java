package test.com.struct;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class demo {


    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }

        public static void add(Node List, char data) {
            Node position = List;
            while (position.next != null)
                position = position.next;
            position.next = new Node(data);
        }

        public static void show(Node List) {
            Node position = List.next;
            while (position != null) {
                System.out.print(position.data);
                position = position.next;
            }
            System.out.println();
        }

        public static char randomChar() {
            return ((char) ThreadLocalRandom.current().nextInt(65, 91));
        }

        public static Node randomList(int number) {
            Node List = new Node('-');
            for (int i = 0; i < number; i++) {
                add(List, randomChar());
            }
            return List;
        }

        public static Node findPrevious(char c, Node List) {
            Node p;
            p = List;
            while (p.next != null && p.next.data != c)
                p = p.next;
            return p;
        }

        public static void deduplication(Node List) {
            Node p = List.next;


        }


        public static Node replenish(Node list) {
            Node position = list.next;
            Node repList = new Node('-');
            Node repPosition = repList;
            char[] array26 = new char[26];
            for (int i = 0; i < array26.length; i++) {
                array26[i] = (char) (65 + i);
            }

            while (position != null) {
                for (int i = 0; i < array26.length; i++) {
                    if (position.data == array26[i])
                        array26[i] = '-';
                }
                position = position.next;
            }

            for (int i = 0; i < array26.length; i++) {
                if (array26[i] != '-') {
                    repPosition.next = new Node(array26[i]);
                    repPosition = repPosition.next;
                }
            }
            return repList;
        }

//        public static Node cross(Node List1, Node List2) {
//            Node crossList = new Node('-');
//            Node position1 = List1.next;
//            Node position2 = List2.next;
//            Node croPosition = crossList;
//
//            while (position1 != null) {
//                while (position2 != null) {
//                    if (position1.data == position2.data) {
//                        croPosition.next = new Node(position1.data);
//                        croPosition = croPosition.next;
//                    }
//                    position2 = position2.next;
//                }
//                position2 = List2.next;
//                position1 = position1.next;
//            }
//
//            return crossList;
//        }

        public static Node andList(Node List1, Node List2) {
            Node andList = new Node('-');
            Node position1 = List1.next;
            Node position2 = List2.next;
            Node andPosition = andList;
            while (position1 != null) {
                andPosition.next = new Node(position1.data);
                andPosition = andPosition.next;
                position1 = position1.next;
            }

            return andList;
        }

    }

    public static void main(String[] args) {
        Node List = Node.randomList(10);
        Node.show(List);
        Node.deduplication(List);
        Node.show(List);
    }
}