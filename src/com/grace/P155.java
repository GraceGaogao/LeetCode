package com.grace;
import java.util.Stack;

public class P155 {
    public static void main(String args[]) {
        MinStack obj = new MinStack();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        obj.top();
        obj.getMin();
    }
}
class MinStack {
    int flag = 0;
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(flag == 0) {
            minStack.push(x);
            flag = 1;
        }
        if(x<=minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);

    }

    public void pop() {
        if(!(stack.isEmpty())) {
            if(stack.peek().equals(minStack.peek())) {
                if(!(minStack.isEmpty())) {
                    minStack.pop();
                }
            }
            stack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}