class Solution {
    public int fib(int n) {
        // if(n<=1){
        //     return n;
        // }
        // int fnm1=fib(n-1);
        // int fnm2=fib(n-2);

        // return fnm1+fnm2;

        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        for(int i=2; i<=n; i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}