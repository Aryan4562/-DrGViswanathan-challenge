class Solution {
    public double myPow(double x, int n) {
        // long exp =n;
        boolean negative = false;
        if(n<0) negative=true;
        double result =(negative)? pow(x,n*(-1)) : pow(x,n);
        if(negative) return 1/result;
        return result;
        // if(exp < 0){
        //     x = 1/x;
        //     exp = -exp;

        // }
        // double ans = 1;

        // while(exp > 0){
        //     if (exp%2 !=0){
        //         ans *= x;
        //     }
        //     x *= x;
        //     exp /=2;

        // }
        // return ans;
    }
    public double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double half = pow(x,n/2);
        if(n%2==0){return half*half;}
        return half*half*x;
    }
}