class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return isPali(sb.toString());
    }

    boolean isPali(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
