public class stringpractice {
    public static void main(String args[]) {
        String s1 = "  Hello  how are you";
        
        int start = 0, end = s1.length() - 1;
        // while (start <= end && s1.charAt(start) == ' ') start++;
        // while (end >= start && s1.charAt(end) == ' ') end--;
    
        StringBuilder result = new StringBuilder();
        int i = start;
        while (i <= end) {
            while (i <= end && s1.charAt(i) == ' ') {
            result.append(' ');
            i++;
            }
            int wordStart = i;
            while (i <= end && s1.charAt(i) != ' ') {
            i++;
            }
            int wordEnd = i - 1;
            for (int j = wordEnd; j >= wordStart; j--) {
            result.append(s1.charAt(j));
            }
        }
        System.out.println(result.toString());
    }
}