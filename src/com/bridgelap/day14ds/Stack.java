package com.bridgelap.day14ds;

    public class Stack<T> {

        LinkedList<T> linkedList;

        public Stack() {
            this.linkedList = new LinkedList<>();
        }

        public void push(T key) {
            linkedList.push(key);
        }

        public void print() {
            linkedList.print();
        }

        public T pop() {
            return linkedList.pop();
        }
    }



