package Grind75;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args){
        boolean result = isValid("]]");
        System.out.println("result = " + result + "\n");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(stack.empty()){
                stack.push(ch);
            }else{
                if(check(stack.peek(), ch)){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    public static boolean check(char open, char close){
        if(open=='('){
            if(close==')')
                return true;
        }else if(open=='{'){
            if(close=='}')
                return true;
        }else if(open=='['){
            if(close==']')
                return true;
        }
        return false;
    }
}
