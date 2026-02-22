class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int xor  = 0;
            for(int j = i; j<arr.length; j++){
                xor ^= arr[j];
                
                if(xor==k){
                    count++;
                }
            }
        }
        return count;
    }
}
