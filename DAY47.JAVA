class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        List<List<Integer>>result = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            int diff = arr[i+1]-arr[i];

            if(diff<mindiff){
                mindiff  = diff;
                
                result.clear();
                List<Integer>list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
            else if(diff==mindiff){
                List<Integer>list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }

        return result;
    }
}
