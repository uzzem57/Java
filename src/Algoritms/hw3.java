package Algoritms;

import org.w3c.dom.Node;

import java.util.Iterator;

public class hw3 {

        public static void main(String[] args) {
            SingleLinkList<NameList> contactList = new SingleLinkList<>();

            contactList.addToEnd(new NameList( "Александр" ));
            contactList.addToEnd(new NameList( "Виталий"));
            contactList.addToEnd(new NameList( "Дмитрий"));
            contactList.addToEnd(new NameList( "Егор"));
            contactList.addToEnd(new NameList( "Леонид"));

            for (Object contact : contactList) {
                System.out.println(contact);
            }
            contactList.reverse();

            System.out.println("-------------------------------------");

            for (Object contact : contactList) {
                System.out.println(contact);
            }
        }

        static class NameList {

            String name;

            public NameList ( String name) {
                this.name = name;

            }

            @Override
            public String toString() {
                return "Contact{" +
                        "name='" + name + '\'' +  '}';
            }
        }

        public static class SingleLinkList<T> implements Iterable {

            ListItem<T> head;
            ListItem<T> tail;

            @Override
            public Iterator iterator() {
                return new Iterator<T>() {
                    ListItem<T> current = head;

                    @Override
                    public boolean hasNext() {
                        return current != null;
                    }

                    @Override
                    public T next() {
                        T data = current.data;
                        current = current.next;
                        return data;
                    }
                };
            }

            private static class ListItem<T> {

                T data;
                ListItem<T> next;
            }

            public boolean isEmpty() {
                return head == null;
            }

            public void addToEnd(T item) {


                ListItem<T> newItem = new ListItem<>();
                newItem.data = item;


                if (isEmpty()) {
                    head = newItem;
                    tail = newItem;
                } else {
                    tail.next = newItem;
                    tail = newItem;
                }
            }

            public void reverse() {
                if (!isEmpty() && head.next != null) {
                    tail = head;
                    ListItem<T> current = head.next;
                    head.next = null;
                    while (current != null) {
                        ListItem<T> next = current.next;
                        current.next = head;
                        head = current;
                        current = next;
                    }
                }
            }
        }
    }

