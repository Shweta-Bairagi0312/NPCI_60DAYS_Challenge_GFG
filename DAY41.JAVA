class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }

        }
        return (min+k)>(max-k)?0:(max-k)-(min+k);
        
    }
}
