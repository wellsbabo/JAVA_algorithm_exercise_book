package Grind75;

public class ValidPalindrome {
    public static void main(String[] args){
        boolean result = isPalindrome("0P");
        System.out.println("result = " + result);;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.toUpperCase());
        StringBuilder newStr = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (48<=str.charAt(i) && str.charAt(i)<=57)){
                // str.deleteCharAt(i);
                newStr.append(str.charAt(i));
            }
        }

        // System.out.println("newStr = " + newStr.toString());

        String origin = newStr.toString();

        String reverse = newStr.reverse().toString();

        // System.out.println("reverseStr = " + reverse.toString());

        // System.out.println("newStr = " + newStr.toString());

        if(origin.equals(reverse)){
            return true;
        }
        return false;

    }
}
