
import java.util.*;

public class ques2 {

    public static String mySubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = mySubstring(text, start, end);

        String builtinSub = text.substring(start, end);

        boolean areEqual = compareStrings(manualSub, builtinSub);

        System.out.println("\nManual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtinSub);
        System.out.println("Comparison result: " + areEqual);

        sc.close();
    }
}
