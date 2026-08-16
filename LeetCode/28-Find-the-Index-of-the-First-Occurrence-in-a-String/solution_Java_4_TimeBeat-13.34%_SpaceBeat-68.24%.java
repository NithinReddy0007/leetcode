class Solution {
    public int pr = 37;
    public int mod = 1000000007;

    public int strStr(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        if (m > n) return -1;
        if (m == 0) return 0;

        long patternHash = 0;
        long windowHash = 0;
        long power = 1;

        // Compute initial hashes
        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * pr + pat.charAt(i)) % mod;
            windowHash = (windowHash * pr + txt.charAt(i)) % mod;

            if (i != m - 1)
                power = (power * pr) % mod;  // pr^(m-1)
        }

        if (patternHash == windowHash && txt.substring(0, m).equals(pat))
            return 0;

        for (int i = m; i < n; i++) {

            // Remove left character
            windowHash = (windowHash - txt.charAt(i - m) * power % mod + mod) % mod;

            // Add new character
            windowHash = (windowHash * pr + txt.charAt(i)) % mod;

            if (windowHash == patternHash &&
                txt.substring(i - m + 1, i + 1).equals(pat)) {
                return i - m + 1;
            }
        }

        return -1;
    }
}
