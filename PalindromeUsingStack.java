package palindromeusingstack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStack {

    public static void main(String[] args) {
        String reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("enter input string to check palendrome or not");
        String str = s.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }
        if (str.equals(reverse)) {
            System.out.println("the input String palindrome");
        } else {
            System.out.println("the input String not- palindrome");
        }
    }
}
