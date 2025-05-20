class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp;
        int [] output={0,0};
        for (int i=0 ; i<nums.length ; i++){
            temp=target-nums[i];
            output[0]=i;
            for(int j=i+1;j<nums.length; j++){
                if(temp==nums[j]){
                    output[1]=j;
                    return output;
                }
            }

        }
        return output;
    }
}
