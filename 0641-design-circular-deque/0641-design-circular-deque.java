class MyCircularDeque {
    ArrayDeque<Integer>dq=new ArrayDeque<>();
    int maxsize=0;// Initialize maximum size
    public MyCircularDeque(int k) {
        maxsize=k;
    }
    
    public boolean insertFront(int value) {
        if(dq.size()==maxsize){
            return false;
        }
        return dq.offerFirst(value);
            //Deque is already full return false;
    }
    
    public boolean insertLast(int value) {
        if(dq.size()==maxsize){
            return false;
        }
        return dq.offerLast(value);
    }
    
    public boolean deleteFront() {
        if(dq.isEmpty()){
            return false;
        }
        dq.pollFirst();
        return true;
    }
    
    public boolean deleteLast() {
         if(dq.isEmpty()){
            return false;
        }
        dq.pollLast();
        return true;
    }
    
    public int getFront() {
        if(dq.isEmpty()){
            return -1;
        }
        return dq.peekFirst();
    }
    
    public int getRear() {
        if(dq.isEmpty()){
            return -1;
        }
        return dq.peekLast();
    }
    
    public boolean isEmpty() {
        if(dq.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(dq.size()==maxsize){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */