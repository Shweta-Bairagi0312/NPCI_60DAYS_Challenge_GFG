class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer>maap = new HashMap<>();
        List<Integer>res = new ArrayList<>();

        for(int n: nums1){
            maap.put(n, maap.getOrDefault(n,0)+1);
        }
        for(int n: nums2){
            if(maap.containsKey(n)&& maap.get(n)>0){
                res.add(n);
                maap.put(n,maap.get(n)-1);
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;

    }
}
