package assignment;

public class ExcuseLetterStack05 {
    ExcuseLetter05[] stack;
    int top, size;

    public ExcuseLetterStack05(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter05[size];
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(ExcuseLetter05 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public ExcuseLetter05 pop() {
        if (!isEmpty()) {
            ExcuseLetter05 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("No data in stack!");
            return null;
        }
    }

    public ExcuseLetter05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("No data in stack!");
            return null;
        }
    }

    public void search(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Letter found:");
                System.out.println("ID: " + stack[i].id);
                System.out.println("Name: " + stack[i].name);
                System.out.println("Class: " + stack[i].className);
                System.out.println("Type: " + stack[i].typeOfExcuse);
                System.out.println("Duration: " + stack[i].duration + " days");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Letter not found!");
        }
    }
}
