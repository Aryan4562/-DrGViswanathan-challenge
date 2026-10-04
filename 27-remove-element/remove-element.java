class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        for(int j =0; j < nums.length; j++){
            if(val != nums[j]){
                nums[k] = nums[j];
                k++;
            }    

           
        }

        return k;
    }
}