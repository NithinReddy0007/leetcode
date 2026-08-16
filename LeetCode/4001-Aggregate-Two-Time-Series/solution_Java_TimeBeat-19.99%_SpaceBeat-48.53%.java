class Solution {
    public int search(int[][] x,int k){
        int low = 0;
        int high = x.length - 1;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(x[mid][0]>=k){
                ans = mid;
                high=mid-1;
            } else {
                low = mid+1;
            }
        }
        return x[ans][1];
    }
    public List<List<Integer>> aggregateTimeSeries(int[][] nums1, int[][] nums2) {

        int l1 = nums1.length;
        int l2 = nums2.length;

        List<List<Integer>> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<l1 && j<l2){

            if(nums1[i][0]==nums2[j][0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i][0]);
                temp.add(nums1[i][1]+nums2[j][1]);
                ans.add(new ArrayList<>(temp));
                i++;
                j++;
            }
            
            else if(nums1[i][0]<nums2[j][0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i][0]);
                temp.add(nums1[i][1]+search(nums2,nums1[i][0]));
                ans.add(new ArrayList<>(temp));
                i++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums2[j][0]);
                temp.add(nums2[j][1]+search(nums1,nums2[j][0]));
                ans.add(new ArrayList<>(temp));
                j++;
            }
        }
        while(i<l1){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[i][0]);
            temp.add(nums1[i][1]);
            ans.add(new ArrayList<>(temp));
            i++;
        }
        while(j<l2){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums2[j][0]);
            temp.add(nums2[j][1]);
            ans.add(new ArrayList<>(temp));
            j++;
        }
        
        return ans;
        
        
    }
}