class Solution {
    public int minSetSize(int[] arr) {
       Arrays.sort(arr);
        int count=1;
        List<Integer> l1 =new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                l1.add(count);
                count=1;                
            }
            else
            {
                count++;
            }
        }
        l1.add(count);
        Collections.sort(l1);
        int a=0,ans=0;
        for(int i=l1.size()-1;i>=0;i--)
        {
            a+=l1.remove(i);
            ans++;
            if(arr.length-a<=arr.length/2)
            {
                break;
            }
        }
        return ans;
    }
}