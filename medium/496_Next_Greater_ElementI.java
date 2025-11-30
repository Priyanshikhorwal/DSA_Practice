class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0 ; i< nums2.length ; i++){

            while( !stack.isEmpty() && nums2[i]>stack.peek()){
                map.put(stack.pop() ,nums2[i]);
                
            } 
            stack.push(nums2[i]);
        }
        for(int i : stack){
            map.put(i , -1);
        }



        for(int i=0 ; i<nums1.length ; i++){
            nums1[i]=map.get(nums1[i]);
        }
         
         return nums1;
    }
}
