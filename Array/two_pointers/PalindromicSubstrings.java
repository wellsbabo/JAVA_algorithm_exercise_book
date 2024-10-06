package Array.two_pointers;

/**
 * LeetCode
 * 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/description/?envType=problem-list-v2&envId=av0verds
 */

public class PalindromicSubstrings {
    public static void main(String args[]){
        int result = countSubstrings("aaa");

        System.out.println("result = " + result);
    }

    public static int countSubstrings(String s){
        int count = 0;

        for(int i=0; i<s.length(); i++){
            // 홀수 길이 팰린드롬
            count += countPalindrome(s, i, i);
            // 짝수 길이 팰린드롬
            count += countPalindrome(s, i, i+1);
        }

        // for(int i = 0; i < len; i++){
        //     for(int j = i+1; j <= len; j++){
        //         if(checkPalindrome(s.substring(i,j))){
        //             // System.out.println("i = " + i + " j = " + j);
        //             // System.out.println("substring = " + s.substring(i,j));
        //             count ++;
        //         }
        //     }       
        // }

        return count;
    }

    /* 브루트포스식 팰린드롬 체크 */
    // public static boolean checkPalindrome(String s){
    //     int len = s.length();
    //     int right = len - 1;
    //     for(int left = 0; left < len; left++){
    //         if(s.charAt(left) != s.charAt(right)){
    //             return false;
    //         }
    //         right--;
    //     }
    //     return true;
    // }

    /* 중심 확장법을 통한 팰린드롬 체크 */
    public static int countPalindrome(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
