class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
       int freq[]=new int[grid.length*grid.length+1];
       int missing=0; 
       int repeated=0;
       for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid.length; j++){
            freq[grid[i][j]]++;
        }
       }
       for(int i=0; i<freq.length; i++){
        if(freq[i]>1){
            repeated=i;
        }
        if(freq[i]==0){
            missing=i;
        }
        
       }
       return new int[]{repeated,missing};
    }
}