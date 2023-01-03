package top.interview.question;

/*
* LeetCode Top Interview Question
* 344. https://leetcode.com/problems/reverse-string/
* */

class ReverseString_344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for ( int i = 0; i <= (n/2)-1; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
    }
}