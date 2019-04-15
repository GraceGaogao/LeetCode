package com.grace;

public class p9 {
    public static void main(String[] args) {
        boolean ans = isPalindrome(121);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }else if(x>=0 && x<10) {
            return true;
        }else {
            int y = x;
            int l=0;
            while (y>0) {
                y/=10;
                l++;
            }
            int arr[] = new int[l];
            for(int i=0;x>0;i++) {
                arr[i] = x%10;
                x = x/10;
            }
            int len = arr.length;
            for(int i=0;i<len/2;i++) {
                if(arr[i] != arr[len-i-1]) {
                    return false;
                }
            }
            return true;
        }

    }
}
