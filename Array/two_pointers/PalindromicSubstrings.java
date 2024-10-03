package Array.two_pointers;

public class PalindromicSubstrings {
    public static void main(String args[]){
        int result = countSubstrings("aaa");

        System.out.println("result = " + result);
    }

    public static int countSubstrings(String s){
        int count = 0;
        int len = s.length();

        for(int i = 0; i < len; i++){
            for(int j = i+1; j <= len; j++){
                if(checkPalindrome(s.substring(i,j))){
                    // System.out.println("i = " + i + " j = " + j);
                    // System.out.println("substring = " + s.substring(i,j));
                    count ++;
                }
            }       
        }

        return count;
    }

    public static boolean checkPalindrome(String s){
        int len = s.length();
        int right = len - 1;
        for(int left = 0; left < len; left++){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }
}
