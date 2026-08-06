class Solution {
          public int countB(int i){
            int count=0;
            while(i>0){
                if((i&1)!=0){
                    count++;
                }
                i=i>>1;
            }
            return count;
          }  
    public int[] countBits(int n) {
          int arr[]=new int[n+1];

          for(int i=0; i<=n; i++){
            int idx=countB(i);
            arr[i]=idx;
          } 

       return arr;    
    }
    
}