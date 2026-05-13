class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for (String w : map1.keySet()) {
            if (map1.get(w) == 1 && map2.getOrDefault(w, 0) == 1) {
                count++;
            }
        }

        return count;
        
    }
}
