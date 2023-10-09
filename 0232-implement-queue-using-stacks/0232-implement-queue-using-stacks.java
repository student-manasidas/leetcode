class MyQueue {
    ArrayDeque<Integer>dq=new ArrayDeque<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        dq.offerLast(x);
    }
    
    public int pop() {
        return dq.pop();
    }
    
    public int peek() {
        return dq.peek();
    }
    
    public boolean empty() {
        return dq.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */