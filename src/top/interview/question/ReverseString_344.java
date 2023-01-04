package top.interview.question;

/*
* LeetCode Top Interview Question
* 344. https://leetcode.com/problems/reverse-string/
* */

class ReverseString_344 {

    public static void main(String[] args) {
        char[] s = {'1','2','3','4','5'};
         s = reverseString(s);
         System.out.println(s);
    }

    public static char[] reverseString(char[] s) {
        int n = s.length;
        for ( int i = 0; i <= (n/2)-1; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }

        return s;
    }
}