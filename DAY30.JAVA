class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>ans = new HashSet<>();
        Set<Integer>res = new HashSet<>();

        for(int num:nums1){
            ans.add(num);
        }

        for(int num: nums2){
            if(ans.contains(num)){
                res.add(num);
            }
        }

        int indx = 0;
        int[]arr = new int[res.size()];

        for(int num:res){
            arr[indx++] = num;
        }

        return arr;

    }
}
