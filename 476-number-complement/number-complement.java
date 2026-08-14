// class Solution {
//     public int findComplement(int num) {
//         int mask=0;
//         int n=num;
//         while(n>0){
//         mask=(mask<<1)|1;
//         n>>=1;
//         }
//         return num^mask;
//     }
// }
class Solution {
    public int findComplement(int num) {
        int mask = 0;

        for (int temp = num; temp > 0; temp >>= 1) {
            mask = (mask << 1) | 1;
        }

        return num ^ mask;
    }
}
            