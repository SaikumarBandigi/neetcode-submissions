class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(num);
        }

        String s = sb.toString();

        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}