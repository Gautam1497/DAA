import java.util.Scanner;

class Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(T value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Cannot push.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T poppedValue = stackArray[top--];
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    public T top() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Stack: ");
        int n=sc.nextInt();
        Stack<Integer> intStack = new Stack<>(n);
        int temp=n;
        System.out.print("Enter "+n+" Element: ");
        while(n-->0){
            int ele=sc.nextInt();
            intStack.push(ele);
        }

        System.out.println("Top element: " + intStack.top());
        System.out.println("Is full: " + intStack.isFull());

        while (temp-->0){
            System.out.print("Popped element: ");
            System.out.println(intStack.pop());
        }

        System.out.println("Top element: " + intStack.top());
        System.out.println("Is empty: " + intStack.isEmpty());
        System.out.println("Is full: " + intStack.isFull());
    }
}