class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        Set<Integer>set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        
        for(int i = low; i<=high; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
