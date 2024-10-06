package Array.traversing_from_the_right;

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
        int[] result = new int[len];
        
        for(int i=0; i<len; i++){
            int count = 0;
            for(int j=i+1; j<len; j++){
                count++;
                if(temperatures[i] < temperatures[j]){
                    result[i] = count;
                    count = -1;
                    break;
                }
            }
            if(count != -1){
                result[i] = 0;
            }
        }
        return result;
    }
}
