import java.util.Scanner;

public class StringReversal_twoPoint{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reverseString = reverser(input);

        System.out.println(reverseString);
    }

    private static String reverser(String input){
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}