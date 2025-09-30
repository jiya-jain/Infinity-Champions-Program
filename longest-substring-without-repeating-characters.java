class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        int maxSum = 0;
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
                j++;
                max++;
                maxSum = Math.max(maxSum,max);
            }else{
                i++;
                j=i;
                map.clear();
                max=0;
            }
        }

        return maxSum;
    }
}
