class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = getNumberOfBitsInASingleNumber(i);
        }
        return arr;
    }
    int getNumberOfBitsInASingleNumber(int num) {
        int count=0;
        while(num!=0)
        {
            num=num&(num-1);
            count++;
        }
        return count;
    }
}
