class Solution {
    public int[] plusOne(int[] digits) {
      int  last=digits.length-1;
        while(last>=0){
            if(digits[last]<9){
                digits[last]++;
                return digits;
            }else{
                digits[last]=0;
            }
            last--;
        }
        
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
        
        
    }
}