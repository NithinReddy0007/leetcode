class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int pre;
        int[] suf = new int[n];
        pre=a[0];
        suf[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],a[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            pre=Math.max(pre,a[i]);
            total+=Math.min(pre,suf[i])-a[i];
        }
        return total;
        
    }
}