class Solution {
    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        return countNumberOf1Bits(num);
    }

    int countNumberOf1Bits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
