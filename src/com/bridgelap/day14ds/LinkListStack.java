package com.bridgelap.day14ds;
import java.util.*;
public class LinkListStack {
    public static void main(String[] args) {
        System.out.println("Stack operation");
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(56);
        stack1.push(30);
        stack1.push(70);
        stack1.print();
        System.out.println();
        System.out.println(stack1.pop());
        stack1.print();
        System.out.println();

    }
}

