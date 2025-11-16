class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int n=s.length();
        if(n==1){
            return true;
        }
        for(int i=0;i<=(n/2)+1;i++){
            if(s.charAt(i)==s.charAt(n-1)){
                n--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}