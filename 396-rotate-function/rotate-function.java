class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            temp+=nums[i]*i;
        }
        int max=temp;

        for(int i=1;i<nums.length;i++)
        {
            temp=temp+sum-nums.length*nums[nums.length-i];
            max=Math.max(max,temp);
        }
        return max;
    }
}