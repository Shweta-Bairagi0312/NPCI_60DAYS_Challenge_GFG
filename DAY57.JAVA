class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] res = new int[n+1];
        for(int i = 0; i<n; i++){
            res[0] = first;
            res[i+1] = encoded[i]^res[i];
        }
        return res;
        
    }
}
