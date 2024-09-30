/**
 * LeetCode
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int result = lengthOfLongestSubstring(s);
        System.out.println(result);

        sc.close();
    }

    public static int lengthOfLongestSubstring(String s) {
        int a = 0;
        int b = 0;
        int max = 0;
        int sum = 0;

        String tmp = s.substring(a,b);

        while(b<s.length()){
            if(a==b){
                b++;
                sum++;
                tmp = s.substring(a, b);
                continue;
            }
            if(tmp.indexOf(s.charAt(b)) == -1){
                b++;
                sum++;
                tmp = s.substring(a, b);
            }else{
                if(sum > max){
                    max = sum;
                }
                a++;
                tmp = s.substring(a, b);
                sum = tmp.length();
            }
        }

        if(sum > max){
            max = sum;
        }

        return max;
    }
}