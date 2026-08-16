class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0]=a[0];
        suf[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],a[i]);
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],a[i]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.min(pre[i],suf[i])-a[i];
        }
        return total;
        
    }
}