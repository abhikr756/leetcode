class Solution {
    public List<Integer> intersection(int[][] nums) {
       int n=nums.length; 
      HashSet<Integer> hp1=new HashSet<>();
       for(int j=0;j<nums[0].length;j++){
           hp1.add(nums[0][j]);
       } 
        for(int i=1;i<n;i++){
             HashSet<Integer> hp2=new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                hp2.add(nums[i][j]);
            }
            hp1.retainAll(hp2);     
        }
         List<Integer> arr=new ArrayList<>(hp1);
         Collections.sort(arr);
        return arr; 
    }
}