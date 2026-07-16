class MyStack {
    int top;
    int[] st;

    public MyStack() {
        top = -1;
        st = new int[10];
    }

    public void push(int x) {
        if (top == 9)
            return;

        top++;
        st[top] = x;
    }

    public int pop() {
        if (top == -1)
            return -1;

        return st[top--];
    }

    public int top() {
        if (top == -1)
            return -1;

        return st[top];
    }

    public boolean empty() {
        return top == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */