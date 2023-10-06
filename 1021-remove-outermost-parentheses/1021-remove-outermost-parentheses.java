class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int a=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '('){
                if(a!=0){
                    str+=ch;
                }
                a++;
            }
            else{
                if(a!=1){
                    str+=ch;
                }
                a--;
            }
        }
        return str;
    }
}