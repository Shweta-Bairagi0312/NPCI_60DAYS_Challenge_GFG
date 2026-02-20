class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[]str = new String[arr.length];
        for(int i = 0; i<arr.length; i++){
            str[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(str,(a,b) ->(b+a).compareTo(a+b));
        
        if(str[0].equals("0")){
            return "0";
        }
        
        StringBuilder res = new StringBuilder();
        for(String s: str){
            res.append(s);
        }
        
        return res.toString();
        
    }
}
