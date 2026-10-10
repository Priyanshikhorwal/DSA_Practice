class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        arr[n-1]=1;
        for(int i=n-2 ; i>=0 ; i--){
            arr[i]=nums[i+1]*arr[i+1];
        }
        
        int sum=1; 
        for(int i=1 ; i<n ; i++){
            sum=sum*nums[i-1];
            arr[i]*=sum;
        }

        return arr;
    }

}