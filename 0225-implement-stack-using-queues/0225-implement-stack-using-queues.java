class MyStack {
    ArrayDeque<Integer>dq=new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        dq.offerFirst(x);
    }
    
    public int pop() {
        return dq.pollFirst();
    }
    
    public int top() {
        return dq.peek();
    }
    
    public boolean empty() {
        return dq.isEmpty();
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