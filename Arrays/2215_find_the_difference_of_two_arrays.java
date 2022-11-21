class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            n1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            n2.add(nums2[i]);
        }
        HashSet<Integer> ans1 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (!n1.contains(nums2[i])) ans1.add(nums2[i]);
        }
        HashSet<Integer> ans2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!n2.contains(nums1[i])) ans2.add(nums1[i]);
        }
        List<Integer> list1 = new ArrayList<>(ans1);
        List<Integer> list2 = new ArrayList<>(ans2);
        ans.add(list2);
        ans.add(list1);
        return ans;   
    }
}