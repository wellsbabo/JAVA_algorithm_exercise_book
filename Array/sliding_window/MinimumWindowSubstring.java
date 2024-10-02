package Array.sliding_window;
/**
 * LeetCode
 * 76. Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/description/
 */

public class MinimumWindowSubstring{
    public static void main(String args[]){
        String result = minWindow("a", "a");
        System.out.println("result = " + result);
    }

    public static String minWindow(String s, String t){
        int[] map = new int[128];
        for(char c : t.toCharArray()){
            map[c]++;
        }

        int start = 0;
        int end = 0;
        int min_len = Integer.MAX_VALUE;
        int count = t.length();
        int min_start = 0;
        int min_end = 0;

        while(end < s.length()){
            char c1 = s.charAt(end);
            if(map[c1]>0){
                count--;
            }
            map[c1]--;
            
            while(count == 0){
                if(min_len > (end - start + 1)){
                    min_len = end - start + 1;
                    min_start = start;
                    min_end = end;
                }
                
                char c2 = s.charAt(start);
                map[c2]++;
                if(map[c2]>0){
                    count++;
                }
                start++;
            }
            end++;
        }
        return min_len==Integer.MAX_VALUE?"":s.substring(min_start, min_end+1);
    }
}