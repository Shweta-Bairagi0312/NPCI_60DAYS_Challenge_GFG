class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer>map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>n/4){
                return num;
            }
        }
        return -1;
    }
}
