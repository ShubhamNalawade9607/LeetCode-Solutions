class Solution {
    public int reverseBits(int n) {
       int reverse=0;

       for(int i=0; i<32; i++){
         int lastBit=n&1;
         reverse=reverse<<1;

         reverse=reverse | lastBit;
         n=n>>1;
    
       }
        return reverse;
    }
}