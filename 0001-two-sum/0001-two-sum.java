class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
          if(!hashmap.containsKey(target-nums[i])){
              hashmap.put(nums[i],i);
          }
          else{
              ans[0]=i;
              ans[1]=hashmap.get(target-nums[i]);
              
          }
       }
       return ans; 
    }
}