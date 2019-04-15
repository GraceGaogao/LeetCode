package com.grace;

import java.util.Stack;

public class P20 {
    public static void main(String args[]) {
        String s = "{[]}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
    public static boolean isValid(String s) {
        Stack s1 = new Stack();
        char[] cs = s.toCharArray();
        if(cs.length==1) {
            return false;
        }
        for (int i=0;i<cs.length;i++) {
            if ((cs[i]=='(')||(cs[i]=='[')||(cs[i]=='{')) {
                s1.push(cs[i]);
            }else {
                System.out.println(s1.peek().toString().toCharArray()[0]);
                if(s1.isEmpty()==true) {
                    return false;
                }
                if (s1.capacity()==1) {
                    return false;
                }
                if(cs[i]!=match(s1.pop().toString().toCharArray()[0])) {
                     return false;
                }else {
                    continue;
                }
            }
        }
        if(s1.isEmpty()==true) {
            return true;
        }else {
            return false;
        }
    }
    public static char match(char c) {
        if(c=='(') {
            return ')';
        }
        if(c=='[') {
            return ']';
        }
        if(c=='{') {
            return '}';
        }
        return ' ';
    }
}
