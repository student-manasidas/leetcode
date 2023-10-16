class MyHashSet {
     List<Integer>list;

    public MyHashSet() {
        list=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!list.contains(key)){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        if(list.contains(key)){
            list.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        if(list.contains(key)){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */