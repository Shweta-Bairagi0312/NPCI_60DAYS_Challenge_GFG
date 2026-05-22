class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];
        int count=0;
        for(int[] nums:dominoes){
            int key = (Math.min(nums[0],nums[1])*10) + Math.max(nums[0],nums[1]);
            count+=map[key]++;
        
        }
        return count;
    }
}
