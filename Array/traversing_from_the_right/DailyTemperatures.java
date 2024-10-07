package Array.traversing_from_the_right;

import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args){
        int[] result = dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});

        System.out.print("result = [ ");
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    public static int[] dailyTemperatures(int[] temperatures){
        int len = temperatures.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[len];

        for(int i = len-1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] = 0;
            }else{
                result[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return result;
    }
}
