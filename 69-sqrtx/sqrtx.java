class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = start+(end-start)/2;
        while(start<=end){
            if((long)mid*mid<(long)x){
                start = mid+1;
            }
            else if((long)mid*mid>(long)x){
                end = mid-1;
            }
            else{
                return mid;
            }
            mid = start+(end-start)/2;
        }
        return mid-1;
    }
}