class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = getNumberOfBitsInASingleNumber(i);
        }
        return arr;
    }
    int getNumberOfBitsInASingleNumber(int num) {
        String binaryString = Integer.toBinaryString(num);

        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
