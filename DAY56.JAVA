class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer>map = new HashMap<>();
        int[]res = new int[nums.length];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer[] arr = new Integer[nums.length];
        for(int i = 0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int fa = map.get(a);
                int fb = map.get(b);

                if(fa==fb)
                    return b-a;
                return fa-fb;
                
            }
        });
         for(int i = 0; i<nums.length; i++){
           nums[i] = arr[i];
        }
        return nums;
    }
} 
