class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i=0,n=nums.length;
        while(i<n){
            if(nums[i]<=n && nums[i]>0 && nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}