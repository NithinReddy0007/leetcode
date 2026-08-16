class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(discounts);
        Arrays.sort(prices);

        int n = prices.length;
        int m = discounts.length;

        int j = m-1;
        int i=n-1;
        double sum = 0;

        while(i>=0 && j>=0){
            sum+= 1D*(prices[i--] * (100 - discounts[j--])) / 100;
        }

        while(i>=0) sum+=prices[i--];
        return sum;
        
    }
}