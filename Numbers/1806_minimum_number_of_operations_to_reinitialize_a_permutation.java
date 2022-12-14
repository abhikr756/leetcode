class Solution {
    public int reinitializePermutation(int n) {
        int[] perm=new int[n];
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            perm[i]=i;
        }
        int ans=0;
        while(true){
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arr[i]=perm[i/2];
                }else{
				    int hf1=(n/2);
                    int hf2=((i-1)/2);
                    arr[i]=perm[(hf1+hf2)];
                }
            }
            boolean fg=true;
            for(int j=0;j<n;j++){
                if(arr[j]!=j){fg=false;
                }
                perm[j]=arr[j];
            }
            ans++;
            if(fg){break;}
        }
        return ans;
    }
}