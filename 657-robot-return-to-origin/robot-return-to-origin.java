class Solution {
    public boolean judgeCircle(String moves) {
        int x=0; 
        int y=0;

        for(int i=0; i<moves.length(); i++){
            char dir=moves.charAt(i);

            if(dir=='U'){
                y++;
            }else if(dir=='D'){
                y--;
            }else if(dir=='L'){
                x--;
            }else{
                x++;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}