class Solution {
    public int strStr(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        if (m > n) return -1;
        if (m == 0) return 0;

        long base = 37;
        long mod = 1000000007;

        long patternHash = 0, windowHash = 0, power = 1;

        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * base + pat.charAt(i)) % mod;
            windowHash = (windowHash * base + txt.charAt(i)) % mod;

            if (i < m - 1)
                power = (power * base) % mod;
        }

        if (patternHash == windowHash)
            return 0;

        for (int i = m; i < n; i++) {
            windowHash = (windowHash - txt.charAt(i - m) * power % mod + mod) % mod;
            windowHash = (windowHash * base + txt.charAt(i)) % mod;

            if (windowHash == patternHash)
                return i - m + 1;
        }

        return -1;
    }
}
