package Grind75;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args){
        boolean result = isAnagram("rat", "car");
        System.out.println("result = " + result);
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }

        // for(char ch : s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }

        // for(char ch : t.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0) -1);
        // }

        for(int n : map.values()){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
