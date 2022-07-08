class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int [] arr = new int [nums1.length+nums2.length];
        int n1=0,n2=0;
        int a=0;
        while(n1<nums1.length && n2<nums2.length){
            if(nums1[n1]<=nums2[n2]){
                arr[a]=nums1[n1];
                n1++;a++;
            }
            else if(nums1[n1]>=nums2[n2]){
                arr[a]=nums2[n2];
                n2++;a++;
            }

        }
        while(n1<nums1.length)
        {
            arr[a]=nums1[n1];
            a++;n1++;
        }
        while(n2<nums2.length)
        {
            arr[a]=nums2[n2];
            a++;n2++;
        }
        int mid=arr.length/2;
        double res=0.0;
        if(arr.length%2==0){
            res=(arr[mid-1]+(arr[mid]-arr[mid-1])/2.0);
            return res;
        }
        res=arr[mid];
        return res;
    }
}