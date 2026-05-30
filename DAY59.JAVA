class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1) sum+= nums[i];
            else if(map.get(nums[i])==2) sum -= nums[i];

        }
        return sum;
    }
}
