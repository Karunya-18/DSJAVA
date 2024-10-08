package stackusingarray;
 class DStack {
    static int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    boolean isEmpty() {
        return (top < 0);
    }
    DStack() {
        top = -1;
    }
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Overflow condition reached");
            return false;
        } else {
            a[++top] = x;
0            return true;
        }
    }
    int pop() {
        if (top < 0) {
            System.out.println("Underflow condition reached");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    int peek() {
        if (top < 0) {
            System.out.println("Underflow condition");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
 }
 public class StackUsingArray {
    public static void main(String[] args) {
        DStack stk = new DStack();
        stk.push(20);
        stk.push(40);
        stk.push(60);
        stk.push(30);
        stk.push(20);
        stk.push(210);
        System.out.println("element poped out : " + stk.pop());
    }
 }