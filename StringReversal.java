public class StringReversal {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        char[] reverse = new char[chars.length];

        for(int i=1; i<=chars.length; i++){
            reverse[i-1] = chars[chars.length - i];
        }

        return new String(reverse);
    }
}