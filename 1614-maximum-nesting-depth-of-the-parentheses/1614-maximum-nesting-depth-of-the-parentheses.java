class Solution {
    public int maxDepth(String s) {
        Stack<Character>stack=new Stack<>();
        int maxi=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')' && !stack.isEmpty()){
                maxi=Math.max(maxi,stack.size());
                stack.pop();
            }
        }
        return maxi;
    }
}