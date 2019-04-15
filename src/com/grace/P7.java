package com.grace;

public class P7 {
    public static void main(String args[]) {
        int x = 9;
        int ans = reverse(x);
        System.out.println(ans);
    }
    public static int reverse(int x) {
        int flag = 0;
        StringBuffer sb = new StringBuffer(" ");
        if(x<0) {
            flag = 1;
            x = -x;
        }
        if(x==0) {
            return 0;
        }
        while (x!=0) {
            sb.append(x%10);
            x /= 10;
        }
        String s;
        s = sb.toString();
        System.out.println(s.trim());
        if(flag == 0) {
            if((Integer.parseInt(s.trim())<Math.pow(2,31)-1)||(Integer.parseInt(s.trim())>-1*Math.pow(2,31))) {
                return 0;

            }else {
                return Integer.parseInt(s.trim());

            }
        }else {
            if((Integer.parseInt(s.trim())<Math.pow(2,31)-1)||(Integer.parseInt(s.trim())>-1*Math.pow(2,31))) {
                return 0;

            }else {
                return -1*Integer.parseInt(s.trim());

            }
        }
    }
}
