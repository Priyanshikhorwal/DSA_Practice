class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int arr1[] = new int[nums.length];

        arr[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            arr[i]= arr[i+1]*nums[i+1];
        }
        arr1[0]=1;
        for(int j=1; j<nums.length; j++){
            arr1[j]= nums[j-1]*arr1[j-1];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i]*arr1[i];
        }
        return nums;
    }
}