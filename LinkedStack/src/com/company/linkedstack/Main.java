package com.company.linkedstack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(new Employee("Jane", "Jones",123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();

        System.out.println(isPalindrome("racecar"));
        System.out.println(reverseString("Hi My name is michael"));
    }

    public static boolean isPalindrome(String str) {
        boolean result = true;

        Deque<Character> stack = new LinkedList<Character>();
        StringBuilder sb = new StringBuilder(str.length());
        String lowercase = str.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);

            if (c >= 'a' && c <= 'z') {
                sb.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversed = new StringBuilder(stack.size());

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }


        return sb.toString().equals(reversed.toString());
    }

    public static String reverseString(String str) {
        Deque<Character> stack = new LinkedList<>();
        StringBuilder reversed = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
